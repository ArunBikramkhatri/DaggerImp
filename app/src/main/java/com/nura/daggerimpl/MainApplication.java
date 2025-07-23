package com.nura.daggerimpl;

import android.app.Application;

import com.nura.daggerimpl.dagger.DaggerUserComponent;
import com.nura.daggerimpl.dagger.UserComponent;

import dagger.android.DaggerApplication;


public class MainApplication extends Application {
    public UserComponent userComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        userComponent  = DaggerUserComponent.builder().build();
    }
}
