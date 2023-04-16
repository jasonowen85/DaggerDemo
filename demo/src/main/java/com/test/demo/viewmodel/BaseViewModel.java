package com.test.demo.viewmodel;

import android.util.Log;


import com.test.demo.model.DataBean;

import javax.inject.Inject;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BaseViewModel extends ViewModel {
    protected final String TAG = getClass().getSimpleName();

    @Inject
    DataBean dataBean;

    private MutableLiveData<String> age;

    public void doAction(int viewId) {
        // fPresent.setState();

    }

    protected void Log(String msg) {
        Log.i(TAG,  msg);
    }
}
