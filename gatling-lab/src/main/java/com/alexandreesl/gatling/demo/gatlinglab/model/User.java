package com.alexandreesl.gatling.demo.gatlinglab.model;

public class User {

  private final long id;
  private final String name;
  private final long phone;

  public User(long id, String name, long phone) {
    this.id = id;
    this.name = name;
    this.phone = phone;
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public long getPhone() {
    return phone;
  }
}
