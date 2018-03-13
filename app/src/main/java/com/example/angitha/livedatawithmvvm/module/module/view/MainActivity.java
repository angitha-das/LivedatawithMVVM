package com.example.angitha.livedatawithmvvm.module.module.view;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.angitha.livedatawithmvvm.R;
import com.example.angitha.livedatawithmvvm.databinding.ActivityMainBinding;
import com.example.angitha.livedatawithmvvm.module.module.viewmodel.ClickCounterViewModel;

import java.util.Locale;

/**
 * Created by angitha on 13/3/18.
 */

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mActivityMainBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
        mActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ClickCounterViewModel clickCounterViewModel = ViewModelProviders.of(this).get(ClickCounterViewModel.class);
        mActivityMainBinding.setViewmodel(clickCounterViewModel);

        clickCounterViewModel.getCount().observe(this, count ->{
         //UpdateUI
         if (count != null) mActivityMainBinding.textView.setText(String.format(Locale.ENGLISH,"%d",count));
        });
    }
}
