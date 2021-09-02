package com.example.android_classroom.ui.teacherOrStudent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TeacherOrStudentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TeacherOrStudentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Teacher Or student picker fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}