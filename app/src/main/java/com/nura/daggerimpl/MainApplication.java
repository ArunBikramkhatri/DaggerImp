package com.nura.daggerimpl;

import android.app.Application;

import com.nura.daggerimpl.dagger.AppModule;

public class MainApplication extends Application {

    public AppModule appModule = new AppModule();

}
