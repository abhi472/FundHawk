package com.abhishek.fundhawk.di;


import com.abhishek.fundhawk.ui.SearchActivity;
import com.abhishek.fundhawk.ui.SearchActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SearchActivity contributeMainInjector();



}
