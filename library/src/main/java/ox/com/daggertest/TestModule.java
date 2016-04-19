package ox.com.daggertest;


import orchextra.dagger.Module;
import orchextra.dagger.Provides;
import orchextra.javax.inject.Singleton;

//import dagger.Module;
//import dagger.Provides;

@Module
public class TestModule {

    @Singleton
    @Provides
    LoggerApp provideLogger() {
        return new LoggerApp();
    }
}
