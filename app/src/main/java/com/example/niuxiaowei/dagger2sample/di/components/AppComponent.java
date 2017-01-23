package com.example.niuxiaowei.dagger2sample.di.components;

import android.content.Context;

import dagger.Component;

import com.example.niuxiaowei.dagger2sample.Navigator;
import com.example.niuxiaowei.dagger2sample.ToastUtil;
import com.example.niuxiaowei.dagger2sample.di.modules.AppModule;

import javax.inject.Singleton;

/**
 * Created by niuxiaowei on 16/3/19.
 */

/**
 * 由于这里 AppComponent 使用了 @Singleton 注解标注其生命周期，
 * 所以对应的 AppModule.class 中创建实例的方法也必须标注为 @Singleton，或者也可以不标注任何 Scope 类型的注解
 * 保持关联的 Component 和 Module 之间的 Scope 是一样的
 */
@Singleton
@Component(modules={AppModule.class})
public interface AppComponent {

    Context getContext();

    Navigator getNavigator();
    ToastUtil getToastUtil();
//    Test test();

}
