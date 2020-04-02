package com.netease.dagger2;

import dagger.Component;

@Component(modules = StudentModule.class) // 快递员拿到了包裹
public interface StudentComponent {

    // 送到收获地址 --- 注入到Activity
    void injectMainActivity(MainActivity mainActivity); // 不支持多态功能的，就是参数不能是Object或者Activity

    void injectMainActivity(MainActivity2 mainActivity);

    void injectMainActivity(MainActivity3 mainActivity);

    void injectMainActivity(MainActivity4 mainActivity);

}
