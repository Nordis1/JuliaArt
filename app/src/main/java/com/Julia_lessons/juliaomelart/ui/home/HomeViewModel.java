package com.Julia_lessons.juliaomelart.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("");//сдесь текст идёт на Основной фрагмент, на главную страницу
    }

    public LiveData<String> getText() {
        return mText;
    }
}