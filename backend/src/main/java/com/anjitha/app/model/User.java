package com.anjitha.app.model;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class User {
  private String name;
  private int age;

  public User(){
  }

  public User(String firstName4, int i) {
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return age == user.age && name.equals(user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }
}
