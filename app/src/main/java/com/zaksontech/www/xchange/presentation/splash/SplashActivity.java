package com.zaksontech.www.xchange.presentation.splash;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;

import com.example.ahmed.alcassessment.R;
import com.example.ahmed.alcassessment.data.local.CardDAO;
import com.example.ahmed.alcassessment.presentation.base.BaseActivity;
import com.example.ahmed.alcassessment.presentation.cards.CardsActivity;

import javax.inject.Inject;


public class SplashActivity extends BaseActivity {
    @Inject
    CardDAO cardDAO;

    @Override
    protected void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
        getComponent().inject(this);
        PreferenceManager.setDefaultValues(this, R.xml.settings, false);

        cardDAO.open();

        Intent intent = new Intent(this, CardsActivity.class);
        startActivity(intent);
        finish();
    }
}
