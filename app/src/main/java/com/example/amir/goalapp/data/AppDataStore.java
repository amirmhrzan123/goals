package com.example.amir.goalapp.data;

import io.reactivex.Flowable;
import io.reactivex.Observable;

/**
 * Created by Amir on 11/10/2017.
 */

public interface AppDataStore {
    Observable getObservableData();
    Flowable getFlowableData();
}
