package com.example.amir.goalapp.data.rest;

import com.example.amir.goalapp.data.AppDataStore;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by Amir on 11/10/2017.
 */

public class RemoteDataManager implements AppDataStore {


    @Override
    public Observable getObservableData() {
        return null;
    }

    @Override
    public Flowable getFlowableData() {
        return null;
    }
}
