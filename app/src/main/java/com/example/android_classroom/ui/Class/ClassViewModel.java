package com.example.android_classroom.ui.Class;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClassViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ClassViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Class fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}