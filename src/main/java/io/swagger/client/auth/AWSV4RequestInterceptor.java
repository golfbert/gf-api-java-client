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

import java.io.IOException;

/** This interceptor compresses the HTTP request body. Many webservers can't handle this! */
public class AWSV4RequestInterceptor implements Interceptor {
  @Override public Response intercept(Interceptor.Chain chain) throws IOException {
    System.out.println("intercepted");

    String accessKey = "";
    String accessSecret = "";
    String region = "us-east-1";
    String service = "execute-api";
    String method = "GET";
    String canonicalURI = "/v1/courses/";
    String body = null;

    Request originalRequest = chain.request();

    TreeMap<String, String> qParams = new TreeMap<String, String>();

    TreeMap<String, String> awsHeaders = new TreeMap<String, String>();
    //awsHeaders.put("host", "api.golfbert.com");

    for(Map.Entry<String,List<String>> entrySet : originalRequest.headers().toMultimap().entrySet()) {
      System.out.println("headers: " + entrySet.getKey() + " - " + entrySet.getValue().get(0));

      awsHeaders.put(entrySet.getKey(), entrySet.getValue().get(0));
    }

    String bodyStr = null;

    if(originalRequest.body() != null) {
      try {
        final Request copy = originalRequest.newBuilder().build();
        final Buffer buffer = new Buffer();
        copy.body().writeTo(buffer);
        bodyStr = buffer.readUtf8();

        System.out.println("body: " + bodyStr);
      } catch (final IOException e) {
        System.out.println("error in reading body");
      }
    }

    AWSV4Auth aWSV4Auth = new AWSV4Auth.Builder(accessKey, accessSecret)
                                               .regionName(region)
                                               .serviceName(service) // es - elastic search. use your service name
                                               .httpMethodName(method) //GET, PUT, POST, DELETE, etc...
                                               .canonicalURI(canonicalURI) //end point
                                               .queryParametes(qParams) //query parameters if any
                                               .awsHeaders(awsHeaders) //aws header parameters
                                               .payload(bodyStr) // payload if any
                                               .debug() // turn on the debug mode
                                               .build();

    Request.Builder reqBuild = originalRequest.newBuilder();

    /* Get header calculated for request */
    Map<String, String> header = aWSV4Auth.getHeaders();
    for (Map.Entry<String, String> entrySet : header.entrySet()) {
      String key = entrySet.getKey();
      String value = entrySet.getValue();

      System.out.println("put key: " + key + " value: " + value);

      //headerParams.put(key, value);
      reqBuild = reqBuild.header(key, value);
    }

    Request awsRequest = reqBuild
        .method(originalRequest.method(), originalRequest.body())
        .build();

    return chain.proceed(awsRequest);
  }
}
