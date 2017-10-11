package com.example.amir.goalapp.base;

/**
 * Created by Amir on 11/10/2017.
 */

public interface BaseView<T extends BasePresenter> {
    void setPresenter(T presenter);
}
