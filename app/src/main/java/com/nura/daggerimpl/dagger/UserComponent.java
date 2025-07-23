package com.nura.daggerimpl.dagger;

import com.nura.daggerimpl.MainActivity;
import com.nura.daggerimpl.models.User;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface UserComponent {
    void inject(MainActivity mainActivity);
}
