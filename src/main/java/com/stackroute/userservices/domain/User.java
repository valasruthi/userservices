package com.stackroute.userservices.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
  @Id
  int id;
  String Name;
  int age;

  public User() {
  }

  public User(int id, String firstName, int age) {
    this.id = id;
    this.Name = Name;
    this.age = age;
  }


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }


  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
      "id=" + id +
      ", Name='" + Name + '\'' +
      ", age=" + age +
      '}';
  }
}
