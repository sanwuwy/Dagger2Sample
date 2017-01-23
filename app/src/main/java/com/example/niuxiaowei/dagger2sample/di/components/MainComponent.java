package com.example.niuxiaowei.dagger2sample.di.components;

import com.example.niuxiaowei.dagger2sample.di.modules.ActivityModule;
import com.example.niuxiaowei.dagger2sample.di.modules.MainModule;
import com.example.niuxiaowei.dagger2sample.di.scopes.PerActivity;
import com.example.niuxiaowei.dagger2sample.view.MainActivity;

import dagger.Component;

/**
 * MainComponent继承了ActivityComponent，假如ActivityComponent中定义了创建类实例方法，则MainComponent中必须提供@Inject或@Provides对应的
 * 初始化类实例的方法
 * Created by niuxiaowei on 16/3/20.
 */

/**
 * 这里使用了三个组织Component的方式：
 * 1. 依赖方式， 使用 dependencies
 * 2. 包含方式，如MainFragmentComponent
 * 3. 继承方式，如ActivityComponent
 */
@PerActivity
@Component(dependencies = AppComponent.class, modules = {MainModule.class, ActivityModule.class})
public interface MainComponent extends ActivityComponent {
    /*
     * 通过 inject 方法将 MainComponent 管理的类实例注入到 MainActivity 中来
     * 即 MainComponent 将 MainActivity 与 MainActivity依赖的类实例关联起来了
     */
    void inject(MainActivity mainActivity);


    /*
     * MainComponent 包含 MainFragmentComponent，所以 MainFragmentComponent 使用了 @Subcomponent 注解
     * 这就相当于是 Activity 与 Fragment 的关系
     * 这说明 MainActivity 还依赖 MainFragmentComponent 管理的实例
     */
    MainFragmentComponent mainFragmentComponent();
}
