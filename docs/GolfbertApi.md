# GolfbertApi

All URIs are relative to *https://api.golfbert.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCourse**](GolfbertApi.md#getCourse) | **GET** /v1/courses/{id} | v1/courses/{id}
[**getHole**](GolfbertApi.md#getHole) | **GET** /v1/holes/{id} | v1/holes/{id}
[**getScorecard**](GolfbertApi.md#getScorecard) | **GET** /v1/courses/{id}/scorecard | v1/courses/{id}/scorecard
[**listCourseTeeboxesForCourse**](GolfbertApi.md#listCourseTeeboxesForCourse) | **GET** /v1/courses/{id}/teeboxes | v1/courses/{id}/teeboxes
[**listCourses**](GolfbertApi.md#listCourses) | **GET** /v1/courses/ | v1/courses
[**listFlagColors**](GolfbertApi.md#listFlagColors) | **GET** /v1/teeboxcolors | v1/teeboxcolors
[**listHoles**](GolfbertApi.md#listHoles) | **GET** /v1/holes/ | v1/holes
[**listHolesForCourse**](GolfbertApi.md#listHolesForCourse) | **GET** /v1/courses/{id}/holes | v1/courses/{id}/holes
[**listPolygonsForHole**](GolfbertApi.md#listPolygonsForHole) | **GET** /v1/holes/{id}/polygons | v1/holes/{id}/polygons
[**listTeeboxTypes**](GolfbertApi.md#listTeeboxTypes) | **GET** /v1/teeboxtypes | v1/teeboxtypes
[**listTeeboxesForHole**](GolfbertApi.md#listTeeboxesForHole) | **GET** /v1/holes/{id}/teeboxes | v1/holes/{id}/teeboxes
[**ping**](GolfbertApi.md#ping) | **GET** /status | v1/ping


<a name="getCourse"></a>
# **getCourse**
> Course getCourse(id)

v1/courses/{id}

Retrieves a course&#39;s details. This call expands on the information returned by the course listings call.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer id = 56; // Integer | the id of the course whose information to be returned
try {
    Course result = apiInstance.getCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#getCourse");
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

v1/holes/{id}

Retrieves a hole&#39;s details including geo information

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer id = 56; // Integer | the hole id
try {
    Hole result = apiInstance.getHole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#getHole");
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

v1/courses/{id}/scorecard

Retrieves a course&#39;s scorecard. An example of information returned can be found [here.](http://golfbert.com/courses/scorecard/17078)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer id = 56; // Integer | the course id whose scorecard to return
try {
    Scorecard result = apiInstance.getScorecard(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#getScorecard");
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
> Listofcourseteeboxes listCourseTeeboxesForCourse(id)

v1/courses/{id}/teeboxes

Retrieves a course&#39;s teeboxes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer id = 56; // Integer | the course id
try {
    Listofcourseteeboxes result = apiInstance.listCourseTeeboxesForCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listCourseTeeboxesForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the course id |

### Return type

[**Listofcourseteeboxes**](Listofcourseteeboxes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCourses"></a>
# **listCourses**
> Listofcourses listCourses(limit, marker, name, city, state, zipcode, lat, _long)

v1/courses

Retrieves a paginated list of courses. The request can be further parameterized to filter courses by name, city, state, zipcode, or gps coordinates. General course information can be found [here.](http://golfbert.com/courses/search)

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer limit = 10; // Integer | maximum number of results to return
Integer marker = 0; // Integer | marker of where to start returning results (in this case course id)
String name = "name_example"; // String | return only courses that match this name e.g. Torrey Pines
String city = "city_example"; // String | return only courses within given city e.g. Chicago
String state = "state_example"; // String | return only courses within given state e.g. Alabama
String zipcode = "zipcode_example"; // String | return only courses within given zip code e.g. 99205
Double lat = 3.4D; // Double | return only courses within given latitude and longitude. The params lat and long must be specified together otherwise the api will fail
Double _long = 3.4D; // Double | return only courses within given latitude and longitude. The params lat and long must be specified together otherwise the api will fail
try {
    Listofcourses result = apiInstance.listCourses(limit, marker, name, city, state, zipcode, lat, _long);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listCourses");
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

[**Listofcourses**](Listofcourses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFlagColors"></a>
# **listFlagColors**
> Listofteeboxcolors listFlagColors()

v1/teeboxcolors

Retrieves all available teebox colors

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
try {
    Listofteeboxcolors result = apiInstance.listFlagColors();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listFlagColors");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Listofteeboxcolors**](Listofteeboxcolors.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHoles"></a>
# **listHoles**
> Listofholes listHoles(courseId, limit, marker)

v1/holes

Retrieves a paginated list of holes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer courseId = 56; // Integer | the course whose holes to return
Integer limit = 18; // Integer | maximum number of results to return
Integer marker = 1; // Integer | marker of where to start returning results (in this case hole number)
try {
    Listofholes result = apiInstance.listHoles(courseId, limit, marker);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listHoles");
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

[**Listofholes**](Listofholes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHolesForCourse"></a>
# **listHolesForCourse**
> Listofholes listHolesForCourse(id)

v1/courses/{id}/holes

Retrieves a course&#39;s holes&#39; information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer id = 56; // Integer | the course id whose holes info to return
try {
    Listofholes result = apiInstance.listHolesForCourse(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listHolesForCourse");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the course id whose holes info to return |

### Return type

[**Listofholes**](Listofholes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPolygonsForHole"></a>
# **listPolygonsForHole**
> Listofholepolygons listPolygonsForHole(id)

v1/holes/{id}/polygons

Retrieves a holes&#39;s polygons. This information can be used to render the hole accurately on top of a map.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer id = 56; // Integer | the hole id
try {
    Listofholepolygons result = apiInstance.listPolygonsForHole(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listPolygonsForHole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**| the hole id |

### Return type

[**Listofholepolygons**](Listofholepolygons.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTeeboxTypes"></a>
# **listTeeboxTypes**
> Listofteeboxtypes listTeeboxTypes()

v1/teeboxtypes

Retrieves all available teebox types. This serves as an enum of all available teebox types

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
try {
    Listofteeboxtypes result = apiInstance.listTeeboxTypes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listTeeboxTypes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Listofteeboxtypes**](Listofteeboxtypes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTeeboxesForHole"></a>
# **listTeeboxesForHole**
> Listofholeteeboxes listTeeboxesForHole(id, color, teeboxtype, par, handicap)

v1/holes/{id}/teeboxes

Retrieves a holes&#39;s teeboxes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
Integer id = 56; // Integer | the hole id
String color = "color_example"; // String | teebox color to filter by
String teeboxtype = "teeboxtype_example"; // String | teebox type to filter by
Integer par = 56; // Integer | only show holes with a specific par
Integer handicap = 56; // Integer | only show holes with a specific handicap
try {
    Listofholeteeboxes result = apiInstance.listTeeboxesForHole(id, color, teeboxtype, par, handicap);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#listTeeboxesForHole");
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

[**Listofholeteeboxes**](Listofholeteeboxes.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="ping"></a>
# **ping**
> Ping ping()

v1/ping

Pings the Golfbert API to determine status. A 200-type of response signifies success.

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.GolfbertApi;


GolfbertApi apiInstance = new GolfbertApi();
try {
    Ping result = apiInstance.ping();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GolfbertApi#ping");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Ping**](Ping.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

