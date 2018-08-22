package com.abhishek.fundhawk.di;


import com.abhishek.fundhawk.ui.compare.CompareFundActivity;
import com.abhishek.fundhawk.ui.compare.CompareFundActivityModule;
import com.abhishek.fundhawk.ui.search.SearchActivity;
import com.abhishek.fundhawk.ui.search.SearchActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = SearchActivityModule.class)
    abstract SearchActivity contributeMainInjector();

    @ContributesAndroidInjector(modules = CompareFundActivityModule.class)
    abstract CompareFundActivity contributeCompareFundInjector();



}
