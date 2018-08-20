package com.abhishek.fundhawk.di;


import com.abhishek.fundhawk.ui.SearchActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector()
    abstract SearchActivity contributeMainInjector();



}
