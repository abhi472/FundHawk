package com.abhishek.fundhawk;

import android.content.Context;

import com.abhishek.fundhawk.di.DaggerAppComponent;
import com.abhishek.fundhawk.di.DatabaseModule;
import com.abhishek.fundhawk.di.NetworkModule;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class FHApp extends DaggerApplication {

    AndroidInjector<? extends DaggerApplication> androidInjector;


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        androidInjector = DaggerAppComponent.builder()
                .application(this)
                .network(new NetworkModule())
                .database(new DatabaseModule())
                .build();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return androidInjector;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
