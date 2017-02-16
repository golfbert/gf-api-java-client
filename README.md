# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



