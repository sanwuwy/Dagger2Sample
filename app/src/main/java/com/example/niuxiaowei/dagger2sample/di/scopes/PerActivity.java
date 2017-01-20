package com.example.niuxiaowei.dagger2sample.di.scopes;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by niuxiaowei on 16/3/22.
 */

/**
 * 这是一个Scope的注解类，可以使得关联的 Component 和 Module 生命周期保持一致
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerActivity {
}
