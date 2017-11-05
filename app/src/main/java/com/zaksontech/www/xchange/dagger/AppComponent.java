package com.zaksontech.www.xchange.dagger;

import com.example.ahmed.alcassessment.presentation.cards.CardsActivity;
import com.example.ahmed.alcassessment.presentation.settings.SettingsActivity;
import com.example.ahmed.alcassessment.presentation.splash.SplashActivity;

import javax.inject.Singleton;

import dagger.Component;


@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface AppComponent {
    void inject(SplashActivity activity);
    void inject(CardsActivity cardsActivity);
    void inject(SettingsActivity settingsActivity);
}
