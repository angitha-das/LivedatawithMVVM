package com.example.angitha.livedatawithmvvm.module.module.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.view.View;

/**
 * Created by angitha on 13/3/18.
 */

public class ClickCounterViewModel extends ViewModel{
    private MutableLiveData<Integer> count;
    private int incrementValue;

    public ClickCounterViewModel() {
        count = new MutableLiveData<>();
    }

    private void setCount(int mCount) {
        count.postValue(mCount);
    }
    public MutableLiveData<Integer> getCount() {
        return count;
    }

    public void onIncrementClicked(final View view){
    incrementValue+=2;
    setCount(incrementValue);
    }
}
