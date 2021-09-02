package com.example.android_classroom.ui.getStarted;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GetStartedViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GetStartedViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Getting started fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}