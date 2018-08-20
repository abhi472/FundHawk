package com.abhishek.fundhawk.di;

import com.abhishek.fundhawk.FHApp;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class,
        ActivityBuilder.class,
        AppModule.class})
public interface AppComponent extends AndroidInjector<FHApp> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(FHApp app);

        Builder database(DatabaseModule module);

        Builder network(NetworkModule module);



        AppComponent build();
    }

    @Override
    void inject(FHApp instance);
}
