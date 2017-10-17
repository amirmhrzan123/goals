package com.example.amir.goalapp.dagger.component;

import com.example.amir.goalapp.MainActivity;
import com.example.amir.goalapp.dagger.module.AppModule;
import com.example.amir.goalapp.dagger.module.NetworkModule;
import com.google.gson.Gson;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Amir on 12/10/2017.
 */

@Component(
        modules = {AppModule.class, NetworkModule.class}
)
@Singleton
public interface MainComponent {


    void inject(MainActivity mainActivity);

    Gson getGson();


}

