package com.abhishek.fundhawk.di;


import com.abhishek.fundhawk.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector()
    abstract MainActivity contributeMainInjector();



}
