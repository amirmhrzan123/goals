package com.example.amir.goalapp.dagger;

import android.app.Application;

import com.example.amir.goalapp.data.rest.RemoteDataManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Amir on 11/10/2017.
 */

@Module

public class DataModule {
    private Application mApplication;
    public DataModule(Application mApplication){
        this.mApplication = mApplication;
    }

    @Provides
    @Singleton
    RemoteDataManager provideRemoteDataManager(){
        return new RemoteDataManager();
    }

}
