/**
 * Golfbert API
 * This API allows you to access rich golf course information, including gps coordinates and geo polygons of courses holes. This API can only be used in conjunction with a valid api token, access key and secret. More information can be found [here](https://golfbert.com/api).
 *
 * OpenAPI spec version: 1.0.13
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Holedimensions;
import io.swagger.client.model.Holerange;
import io.swagger.client.model.Point;
import java.util.ArrayList;
import java.util.List;


/**
 * Hole
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-16T22:14:27.256-07:00")
public class Hole   {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("courseid")
  private Integer courseid = null;

  @SerializedName("rotation")
  private Double rotation = null;

  @SerializedName("vectors")
  private List<Point> vectors = new ArrayList<Point>();

  @SerializedName("range")
  private Holerange range = null;

  @SerializedName("dimensions")
  private Holedimensions dimensions = null;

  @SerializedName("flagcoords")
  private Point flagcoords = null;

  public Hole id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Hole number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Hole courseid(Integer courseid) {
    this.courseid = courseid;
    return this;
  }

   /**
   * Get courseid
   * @return courseid
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getCourseid() {
    return courseid;
  }

  public void setCourseid(Integer courseid) {
    this.courseid = courseid;
  }

  public Hole rotation(Double rotation) {
    this.rotation = rotation;
    return this;
  }

   /**
   * Get rotation
   * @return rotation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getRotation() {
    return rotation;
  }

  public void setRotation(Double rotation) {
    this.rotation = rotation;
  }

  public Hole vectors(List<Point> vectors) {
    this.vectors = vectors;
    return this;
  }

  public Hole addVectorsItem(Point vectorsItem) {
    this.vectors.add(vectorsItem);
    return this;
  }

   /**
   * Get vectors
   * @return vectors
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Point> getVectors() {
    return vectors;
  }

  public void setVectors(List<Point> vectors) {
    this.vectors = vectors;
  }

  public Hole range(Holerange range) {
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @ApiModelProperty(example = "null", value = "")
  public Holerange getRange() {
    return range;
  }

  public void setRange(Holerange range) {
    this.range = range;
  }

  public Hole dimensions(Holedimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

   /**
   * Get dimensions
   * @return dimensions
  **/
  @ApiModelProperty(example = "null", value = "")
  public Holedimensions getDimensions() {
    return dimensions;
  }

  public void setDimensions(Holedimensions dimensions) {
    this.dimensions = dimensions;
  }

  public Hole flagcoords(Point flagcoords) {
    this.flagcoords = flagcoords;
    return this;
  }

   /**
   * Get flagcoords
   * @return flagcoords
  **/
  @ApiModelProperty(example = "null", value = "")
  public Point getFlagcoords() {
    return flagcoords;
  }

  public void setFlagcoords(Point flagcoords) {
    this.flagcoords = flagcoords;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Hole hole = (Hole) o;
    return Objects.equals(this.id, hole.id) &&
        Objects.equals(this.number, hole.number) &&
        Objects.equals(this.courseid, hole.courseid) &&
        Objects.equals(this.rotation, hole.rotation) &&
        Objects.equals(this.vectors, hole.vectors) &&
        Objects.equals(this.range, hole.range) &&
        Objects.equals(this.dimensions, hole.dimensions) &&
        Objects.equals(this.flagcoords, hole.flagcoords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, number, courseid, rotation, vectors, range, dimensions, flagcoords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hole {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    courseid: ").append(toIndentedString(courseid)).append("\n");
    sb.append("    rotation: ").append(toIndentedString(rotation)).append("\n");
    sb.append("    vectors: ").append(toIndentedString(vectors)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    flagcoords: ").append(toIndentedString(flagcoords)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

