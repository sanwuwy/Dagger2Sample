package com.example.niuxiaowei.dagger2sample.di.modules;

import com.example.niuxiaowei.dagger2sample.data.GetUserData;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by niuxiaowei on 16/3/20.
 */
@Module
public class MainModule {

    /**
     * 这里因为 provideUserData 没有使用跟 MainComponent 一样的 Scope注解 @PerActivity， 所以其自动生成的代码为，
     * this.provideUserDataProvider = MainModule_ProvideUserDataFactory.create(builder.mainModule);
     * @return
     */
    @Provides
    public GetUserData provideUserData(){
        return new GetUserData();
    }

}
