package com.nura.daggerimpl.models;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class User {
    String userName;
    int age;
    boolean isHappy;
    Car car;


    @Inject
    public User(Car car) {
        this.car = car;
        userName = "TestUser";
        age = 25000;
        isHappy = false;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", isHappy=" + isHappy +
                ", car=" + car +
                '}';
    }
}
