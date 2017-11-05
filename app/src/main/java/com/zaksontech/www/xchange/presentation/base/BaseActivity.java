package com.zaksontech.www.xchange.presentation.base;

import android.support.v7.app.AppCompatActivity;

import com.example.ahmed.alcassessment.App;
import com.example.ahmed.alcassessment.dagger.AppComponent;


public class BaseActivity extends AppCompatActivity {
    @Override
    public void overridePendingTransition(int in, int out){
        super.overridePendingTransition(0, 0);
    }

    protected AppComponent getComponent(){
        return ((App)getApplication()).getComponent();
    }
}
