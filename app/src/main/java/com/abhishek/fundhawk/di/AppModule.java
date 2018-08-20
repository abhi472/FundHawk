package com.abhishek.fundhawk.di;

import dagger.Module;

@Module(includes = {DatabaseModule.class,
        NetworkModule.class,
        RepositoryModule.class,
        ViewModelModule.class})
class AppModule {
}
