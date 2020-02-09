package com.alexandreesl.gatling.demo.gatlinglab.model;

import org.springframework.data.annotation.Id;

public class Users {

  @Id private Long id;
  private String name;
  private Long phone;

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Long getPhone() {
    return phone;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }
}
