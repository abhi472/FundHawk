package com.abhishek.fundhawk.di;

import com.abhishek.fundhawk.repository.ApiRepository;
import com.abhishek.fundhawk.repository.ApiRepositoryHelper;

import dagger.Binds;
import dagger.Module;

@Module
public interface RepositoryModule {

    @Binds
    ApiRepository bindApiRepository(ApiRepositoryHelper helper);

}
