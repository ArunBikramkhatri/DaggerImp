package com.nura.daggerimpl.dagger;

import com.nura.daggerimpl.models.Car;
import com.nura.daggerimpl.models.User;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton
@Module
public class AppModule {

    @Provides
    public User user(Car car){
        return new User(car);
    }
}
