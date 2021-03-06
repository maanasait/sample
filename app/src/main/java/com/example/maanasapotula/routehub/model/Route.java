
package com.example.maanasapotula.routehub.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Route {

  @SerializedName("id")
  @Expose
  private String id;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("stops")
  @Expose
  private List<Stop> stops = null;
  @SerializedName("description")
  @Expose
  private String description;
  @SerializedName("accessible")
  @Expose
  private String accessible;
  @SerializedName("image")
  @Expose
  private String image;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Stop> getStops() {
    return stops;
  }

  public void setStops(List<Stop> stops) {
    this.stops = stops;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAccessible() {
    return accessible;
  }

  public void setAccessible(String accessible) {
    this.accessible = accessible;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


}
