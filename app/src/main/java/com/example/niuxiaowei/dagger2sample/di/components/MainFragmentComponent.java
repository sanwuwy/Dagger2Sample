package com.example.niuxiaowei.dagger2sample.di.components;

import com.example.niuxiaowei.dagger2sample.di.scopes.PerActivity;
import com.example.niuxiaowei.dagger2sample.view.MainFragment;

import dagger.Subcomponent;

/**
 * Created by niuxiaowei on 16/3/20.
 */
@PerActivity
@Subcomponent
public interface MainFragmentComponent {


    /*
     * 通过 MainFragmentComponent 将 MainFragment 依赖的实例注入到 MainFragment 中来
     * 而 MainFragment 依赖 MainPresenter 实例，创建 MainPresenter 实例又依赖于 GetUserData 实例
     * 所以在 MainFragmentComponent 的父类 MainComponent 中，加入了 MainModule
     */
    void inject(MainFragment mainFragment);
}
