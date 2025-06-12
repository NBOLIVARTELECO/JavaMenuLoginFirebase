package com.example.javamenulogin.ui.Login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {

    private static  String mText;

    public LoginViewModel() {

        mText ="This is login fragment";
    }

    public static String getText() {
        return mText;
    }


}