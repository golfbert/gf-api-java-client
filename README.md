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
test.java.io.swagger.client.api.GolfbertApiTest.java
```

Before you get started, you MUST enter your AccessKey, SecretToken and API Key that you received from Golfbert. If you are just trying things out, go to http://golfbert.com/api for credentials. Enter the information in:

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
The outcome of the test execution can be found in the subdirectory: build/test-results

## Transition to a Java application

Please follow the [Get Started](#Get Started) first. Once you are comfortable with that, you can create a main() method and populate it with something that looks like this:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.GolfbertApi;

import java.io.File;
import java.util.*;

public class GolfbertApiExample {

    public static void main(String[] args) {

        GolfbertApi apiInstance = new GolfbertApi();
        Integer id = 56; // Integer | the id of the course whose information to be returned
        try {
            Course result = apiInstance.getCourse(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GolfbertApi#getCourse");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.golfbert.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GolfbertApi* | [**getCourse**](docs/GolfbertApi.md#getCourse) | **GET** /v1/courses/{id} | v1/courses/_id_
*GolfbertApi* | [**getHole**](docs/GolfbertApi.md#getHole) | **GET** /v1/holes/{id} | v1/holes/_id_
*GolfbertApi* | [**getScorecard**](docs/GolfbertApi.md#getScorecard) | **GET** /v1/courses/{id}/scorecard | v1/courses/_id_/scorecard
*GolfbertApi* | [**listCourseTeeboxesForCourse**](docs/GolfbertApi.md#listCourseTeeboxesForCourse) | **GET** /v1/courses/{id}/teeboxes | v1/courses/_id_/teeboxes
*GolfbertApi* | [**listCourses**](docs/GolfbertApi.md#listCourses) | **GET** /v1courses/ | v1/courses
*GolfbertApi* | [**listFlagColors**](docs/GolfbertApi.md#listFlagColors) | **GET** /v1/teeboxcolors | v1/teeboxcolors
*GolfbertApi* | [**listHoles**](docs/GolfbertApi.md#listHoles) | **GET** /v1/holes/ | v1/holes
*GolfbertApi* | [**listHolesForCourse**](docs/GolfbertApi.md#listHolesForCourse) | **GET** /v1/courses/{id}/holes | v1/courses/_id_/holes
*GolfbertApi* | [**listPolygonsForHole**](docs/GolfbertApi.md#listPolygonsForHole) | **GET** /v1/holes/{id}/polygons | v1/holes/_id_/polygons
*GolfbertApi* | [**listTeeboxTypes**](docs/GolfbertApi.md#listTeeboxTypes) | **GET** /v1/teeboxtypes | v1/teeboxtypes
*GolfbertApi* | [**listTeeboxesForHole**](docs/GolfbertApi.md#listTeeboxesForHole) | **GET** /v1/holes/{id}/teeboxes | v1/holes/_id_/teeboxes
*GolfbertApi* | [**ping**](docs/GolfbertApi.md#ping) | **GET** /ping | ping


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

It's recommended to create an instance of `GoldbertApi` per thread in a multithreaded environment to avoid any potential issue.
