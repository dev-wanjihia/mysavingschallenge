package com.swc.mysavingschallenge.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.swc.mysavingschallenge.R;
import com.swc.mysavingschallenge.databinding.ActivityMainBinding;
import com.swc.mysavingschallenge.viewmodel.SavingsViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new SavingsViewModel((ActivityMainBinding) DataBindingUtil.setContentView(this, R.layout.activity_main));
    }

}
