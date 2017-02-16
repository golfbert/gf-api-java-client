package io.swagger.client.auth;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.MultipartBuilder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.internal.http.HttpMethod;
import com.squareup.okhttp.Interceptor;
import okio.Buffer;

import io.swagger.client.Pair;

import java.util.Map;
import java.util.TreeMap;
import java.util.List;
import java.net.URLDecoder;
import java.io.IOException;

/** This interceptor compresses the HTTP request body. Many webservers can't handle this! */
public class AWSV4RequestInterceptor implements Interceptor {
  String accessKey;
  String accessSecret;

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public void setKeySecret(String keySecret) {
    this.accessSecret = keySecret;
  }

  @Override public Response intercept(Interceptor.Chain chain) throws IOException {
    final String region = "us-east-1";
    final String service = "execute-api";

    Request originalRequest = chain.request();

    String method = originalRequest.method(); // GET
    String canonicalURI = originalRequest.url().getPath(); //"/v1/courses/"
    String bodyStr = null;

    String urlQuery = originalRequest.url().getQuery();
    TreeMap<String, String> newQueryParams = new TreeMap<String, String>();
    if(urlQuery != null) {
      for(String qToken : urlQuery.split("&")) {
        int idx = qToken.indexOf("=");

        newQueryParams.put(
            URLDecoder.decode(qToken.substring(0, idx), "UTF-8"),
            URLDecoder.decode(qToken.substring(idx + 1), "UTF-8")
            );
      }
    }

    TreeMap<String, String> newHeaders = new TreeMap<String, String>();
    for(Map.Entry<String,List<String>> entrySet : originalRequest.headers().toMultimap().entrySet()) {
      newHeaders.put(entrySet.getKey(), entrySet.getValue().get(0));
    }

    if(originalRequest.body() != null) {
      try {
        final Request copy = originalRequest.newBuilder().build();
        final Buffer buffer = new Buffer();
        copy.body().writeTo(buffer);
        bodyStr = buffer.readUtf8();
      } catch (final IOException e) {
        // maybe you should do something here?
      }
    }

    AWSV4Auth aWSV4Auth = new AWSV4Auth.Builder(accessKey, accessSecret)
                                               .regionName(region)
                                               .serviceName(service) // es - elastic search. use your service name
                                               .httpMethodName(method) //GET, PUT, POST, DELETE, etc...
                                               .canonicalURI(canonicalURI) //end point
                                               .queryParametes(newQueryParams) //query parameters if any
                                               .awsHeaders(newHeaders) //aws header parameters
                                               .payload(bodyStr) // payload if any
                                               .build();
                                               //.debug() // turn on the debug mode


    Request.Builder reqBuild = originalRequest.newBuilder();

    /* Get header calculated for request */
    Map<String, String> header = aWSV4Auth.getHeaders();
    for (Map.Entry<String, String> entrySet : header.entrySet()) {
      String key = entrySet.getKey();
      String value = entrySet.getValue();

      reqBuild = reqBuild.header(key, value);
    }

    Request awsRequest = reqBuild
        .method(originalRequest.method(), originalRequest.body())
        .build();

    return chain.proceed(awsRequest);
  }
}
