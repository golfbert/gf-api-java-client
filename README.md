# gf-api-java-client

## Requirements

Building the API client library requires Java 7 and Gradle to be installed.

## Golfbert API Documentation

The full Golfbert API documentation can be found [here](https://golfbert.com/docs).

## Introduction

This is a Java-based sample project generated using the Golfbert API Swagger definition file which can be found [here](https://golfbert.com/docs/swagger.yml). Post-code-generation, we added code in order to sign the requests using the [AWS Signature V4](http://docs.aws.amazon.com/AmazonS3/latest/API/sig-v4-authenticating-requests.html) specification. There are many libraries available that perform this specific type of signing for you. In our example, we used the one by Vicky Thakor and javaQuery which provides a very [detailed explanation](http://www.javaquery.com/2016/01/aws-version-4-signing-process-complete.html). ALL Golfbert API requests must be authenticated using this method. 

### Get Started

The project exhibits the functionality of the Golfbert API using JUnit tests. The tests are all included within file:

```java
test.java.io.swagger.client.api.DefaultApiTest.java
```

Before you get started, you MUST enter your AccessKey, SecretToken and API Key that you received from Golfbert. If you are just trying things out, contact sales@golfbert.com for trial credentials. Enter the information in:

```java
main.java.io.swagger.client.Configuration.java
```

and more precisely here:

```java

public class Configuration {
    final static String ACCESS_KEY = "<INSERT YOUR ACCESS KEY>";
    final static String KEY_SECRET = "<INSERT YOUR KEY SECRET>";
    final static String API_KEY = "<INSERT YOUR API KEY>";
}
```
Once you've entered your particular information, you can compile and run the tests by executing the following in a terminal window:

```shell
gradle build
```

## Transition to a Java application

Please follow the [Get Started](#Get Started) first. Once you are comfortable with that, you can create a main() method and populate it with something that looks like this:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        Integer id = 56; // Integer | the id of the course whose information to be returned
        try {
            Course result = apiInstance.getCourse(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCourse");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getCourse**](docs/DefaultApi.md#getCourse) | **GET** /courses/{id} | v1/courses/_id_
*DefaultApi* | [**getHole**](docs/DefaultApi.md#getHole) | **GET** /holes/{id} | v1/holes/_id_
*DefaultApi* | [**getScorecard**](docs/DefaultApi.md#getScorecard) | **GET** /courses/{id}/scorecard | v1/courses/_id_/scorecard
*DefaultApi* | [**listCourseTeeboxesForCourse**](docs/DefaultApi.md#listCourseTeeboxesForCourse) | **GET** /courses/{id}/teeboxes | v1/courses/_id_/teeboxes
*DefaultApi* | [**listCourses**](docs/DefaultApi.md#listCourses) | **GET** /courses/ | v1/courses
*DefaultApi* | [**listFlagColors**](docs/DefaultApi.md#listFlagColors) | **GET** /teeboxcolors | v1/teeboxcolors
*DefaultApi* | [**listHoles**](docs/DefaultApi.md#listHoles) | **GET** /holes/ | v1/holes
*DefaultApi* | [**listHolesForCourse**](docs/DefaultApi.md#listHolesForCourse) | **GET** /courses/{id}/holes | v1/courses/_id_/holes
*DefaultApi* | [**listPolygonsForHole**](docs/DefaultApi.md#listPolygonsForHole) | **GET** /holes/{id}/polygons | v1/holes/_id_/polygons
*DefaultApi* | [**listTeeboxTypes**](docs/DefaultApi.md#listTeeboxTypes) | **GET** /teeboxtypes | v1/teeboxtypes
*DefaultApi* | [**listTeeboxesForHole**](docs/DefaultApi.md#listTeeboxesForHole) | **GET** /holes/{id}/teeboxes | v1/holes/_id_/teeboxes
*DefaultApi* | [**ping**](docs/DefaultApi.md#ping) | **GET** /ping | v1/ping


## Documentation for Models

 - [Address](docs/Address.md)
 - [Course](docs/Course.md)
 - [Courseteebox](docs/Courseteebox.md)
 - [GeneralErrorResponse](docs/GeneralErrorResponse.md)
 - [Hole](docs/Hole.md)
 - [Holedimensions](docs/Holedimensions.md)
 - [Holepolygon](docs/Holepolygon.md)
 - [Holerange](docs/Holerange.md)
 - [Holeteebox](docs/Holeteebox.md)
 - [PingResponse](docs/PingResponse.md)
 - [Point](docs/Point.md)
 - [Scorecard](docs/Scorecard.md)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.
