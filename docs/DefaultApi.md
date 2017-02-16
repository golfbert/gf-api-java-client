# DefaultApi

All URIs are relative to *https://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCourse**](DefaultApi.md#getCourse) | **GET** /courses/{id} | v1/courses/_id_
[**getHole**](DefaultApi.md#getHole) | **GET** /holes/{id} | v1/holes/_id_
[**getScorecard**](DefaultApi.md#getScorecard) | **GET** /courses/{id}/scorecard | v1/courses/_id_/scorecard
[**listCourseTeeboxesForCourse**](DefaultApi.md#listCourseTeeboxesForCourse) | **GET** /courses/{id}/teeboxes | v1/courses/_id_/teeboxes
[**listCourses**](DefaultApi.md#listCourses) | **GET** /courses/ | v1/courses
[**listFlagColors**](DefaultApi.md#listFlagColors) | **GET** /teeboxcolors | v1/teeboxcolors
[**listHoles**](DefaultApi.md#listHoles) | **GET** /holes/ | v1/holes
[**listHolesForCourse**](DefaultApi.md#listHolesForCourse) | **GET** /courses/{id}/holes | v1/courses/_id_/holes
[**listPolygonsForHole**](DefaultApi.md#listPolygonsForHole) | **GET** /holes/{id}/polygons | v1/holes/_id_/polygons
[**listTeeboxTypes**](DefaultApi.md#listTeeboxTypes) | **GET** /teeboxtypes | v1/teeboxtypes
[**listTeeboxesForHole**](DefaultApi.md#listTeeboxesForHole) | **GET** /holes/{id}/teeboxes | v1/holes/_id_/teeboxes
[**ping**](DefaultApi.md#ping) | **GET** /ping | v1/ping


<a name="getCourse"></a>
# **getCourse**
> Course getCourse(id)

v1/courses/_id_

Retrieves a course&#39;s details. This call expands on the information returned by the course listings call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | the id of the course whose information to be returned
try {
    Course result = apiInstance.getCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the id of the course whose information to be returned |

### Return type

[**Course**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHole"></a>
# **getHole**
> Hole getHole(id)

v1/holes/_id_

Retrieves a hole&#39;s details including geo information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | the hole id
try {
    Hole result = apiInstance.getHole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getHole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the hole id |

### Return type

[**Hole**](Hole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getScorecard"></a>
# **getScorecard**
> Scorecard getScorecard(id)

v1/courses/_id_/scorecard

Retrieves a course&#39;s scorecard. An example of information returned can be found [here.](http://golfbert.com/courses/scorecard/17078)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | the course id whose scorecard to return
try {
    Scorecard result = apiInstance.getScorecard(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getScorecard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the course id whose scorecard to return |

### Return type

[**Scorecard**](Scorecard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCourseTeeboxesForCourse"></a>
# **listCourseTeeboxesForCourse**
> List&lt;Courseteebox&gt; listCourseTeeboxesForCourse(id)

v1/courses/_id_/teeboxes

Retrieves a course&#39;s teeboxes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | the course id
try {
    List<Courseteebox> result = apiInstance.listCourseTeeboxesForCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listCourseTeeboxesForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the course id |

### Return type

[**List&lt;Courseteebox&gt;**](Courseteebox.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCourses"></a>
# **listCourses**
> List&lt;Course&gt; listCourses(limit, marker, name, city, state, zipcode, lat, _long)

v1/courses

Retrieves a paginated list of courses. The request can be further parameterized to filter courses by name, city, state, zipcode, or gps coordinates. General course information can be found [here.](http://golfbert.com/courses/search)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 10; // Integer | maximum number of results to return
Integer marker = 0; // Integer | marker of where to start returning results (in this case course id)
String name = "name_example"; // String | return only courses that match this name e.g. Torrey Pines
String city = "city_example"; // String | return only courses within given city e.g. Chicago
String state = "state_example"; // String | return only courses within given state e.g. Alabama
String zipcode = "zipcode_example"; // String | return only courses within given zip code e.g. 99205
Double lat = 3.4D; // Double | return only courses within given latitude and longitude. The params lat and long must be specified together otherwise the api will fail
Double _long = 3.4D; // Double | return only courses within given latitude and longitude. The params lat and long must be specified together otherwise the api will fail
try {
    List<Course> result = apiInstance.listCourses(limit, marker, name, city, state, zipcode, lat, _long);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listCourses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| maximum number of results to return | [optional] [default to 10]
 **marker** | **Integer**| marker of where to start returning results (in this case course id) | [optional] [default to 0]
 **name** | **String**| return only courses that match this name e.g. Torrey Pines | [optional]
 **city** | **String**| return only courses within given city e.g. Chicago | [optional]
 **state** | **String**| return only courses within given state e.g. Alabama | [optional]
 **zipcode** | **String**| return only courses within given zip code e.g. 99205 | [optional]
 **lat** | **Double**| return only courses within given latitude and longitude. The params lat and long must be specified together otherwise the api will fail | [optional]
 **_long** | **Double**| return only courses within given latitude and longitude. The params lat and long must be specified together otherwise the api will fail | [optional]

### Return type

[**List&lt;Course&gt;**](Course.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFlagColors"></a>
# **listFlagColors**
> List&lt;String&gt; listFlagColors()

v1/teeboxcolors

Retrieves all available teebox colors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<String> result = apiInstance.listFlagColors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listFlagColors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHoles"></a>
# **listHoles**
> List&lt;Hole&gt; listHoles(courseId, limit, marker)

v1/holes

Retrieves a paginated list of holes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer courseId = 56; // Integer | the course whose holes to return
Integer limit = 18; // Integer | maximum number of results to return
Integer marker = 1; // Integer | marker of where to start returning results (in this case hole number)
try {
    List<Hole> result = apiInstance.listHoles(courseId, limit, marker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listHoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **courseId** | **Integer**| the course whose holes to return |
 **limit** | **Integer**| maximum number of results to return | [optional] [default to 18]
 **marker** | **Integer**| marker of where to start returning results (in this case hole number) | [optional] [default to 1]

### Return type

[**List&lt;Hole&gt;**](Hole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHolesForCourse"></a>
# **listHolesForCourse**
> List&lt;Hole&gt; listHolesForCourse(id)

v1/courses/_id_/holes

Retrieves a course&#39;s holes&#39; information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | the course id whose holes info to return
try {
    List<Hole> result = apiInstance.listHolesForCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listHolesForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the course id whose holes info to return |

### Return type

[**List&lt;Hole&gt;**](Hole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPolygonsForHole"></a>
# **listPolygonsForHole**
> List&lt;Holepolygon&gt; listPolygonsForHole(id)

v1/holes/_id_/polygons

Retrieves a holes&#39;s polygons. This information can be used to render the hole accurately on top of a map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | the hole id
try {
    List<Holepolygon> result = apiInstance.listPolygonsForHole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listPolygonsForHole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the hole id |

### Return type

[**List&lt;Holepolygon&gt;**](Holepolygon.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTeeboxTypes"></a>
# **listTeeboxTypes**
> List&lt;String&gt; listTeeboxTypes()

v1/teeboxtypes

Retrieves all available teebox types. This serves as an enum of all available teebox types

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<String> result = apiInstance.listTeeboxTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listTeeboxTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTeeboxesForHole"></a>
# **listTeeboxesForHole**
> List&lt;Holeteebox&gt; listTeeboxesForHole(id, color, teeboxtype, par, handicap)

v1/holes/_id_/teeboxes

Retrieves a holes&#39;s teeboxes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer id = 56; // Integer | the hole id
String color = "color_example"; // String | teebox color to filter by
String teeboxtype = "teeboxtype_example"; // String | teebox type to filter by
Integer par = 56; // Integer | only show holes with a specific par
Integer handicap = 56; // Integer | only show holes with a specific handicap
try {
    List<Holeteebox> result = apiInstance.listTeeboxesForHole(id, color, teeboxtype, par, handicap);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#listTeeboxesForHole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the hole id |
 **color** | **String**| teebox color to filter by | [optional]
 **teeboxtype** | **String**| teebox type to filter by | [optional]
 **par** | **Integer**| only show holes with a specific par | [optional]
 **handicap** | **Integer**| only show holes with a specific handicap | [optional]

### Return type

[**List&lt;Holeteebox&gt;**](Holeteebox.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ping"></a>
# **ping**
> PingResponse ping()

v1/ping

Pings the Golfbert API to determine status. A 200-type of response signifies success.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    PingResponse result = apiInstance.ping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#ping");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PingResponse**](PingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

