package com.nura.daggerimpl.models;


import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class Car {
    String modelName;

    @Inject
    public Car() {
        this.modelName = "Ford mustang";
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                '}';
    }
}
