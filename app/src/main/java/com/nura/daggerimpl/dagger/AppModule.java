package com.nura.daggerimpl.dagger;

import com.nura.daggerimpl.models.Car;
import com.nura.daggerimpl.models.User;

public class AppModule {
    public Car car = new Car("Ford Mustang");


    public User getUser(){
        User user = new User(car);
        user.setUserName("Arun");
        user.setAge(25);
        user.setHappy(true);
        return user;
    }
}
