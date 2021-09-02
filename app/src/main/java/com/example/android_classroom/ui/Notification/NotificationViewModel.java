package com.example.android_classroom.ui.Notification;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Notification fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}