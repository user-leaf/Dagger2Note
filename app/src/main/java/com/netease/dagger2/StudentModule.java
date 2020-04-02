package com.netease.dagger2;

import dagger.Module;
import dagger.Provides;

// 耳机的包裹
@Module
public class StudentModule {

    // 把Student包裹一层（封装一层），面向的这个module，而不是直接面向Student
    @Provides  // 暴露出去的意思
    public Student getStudent(){
        // 假如Student修改了构造方法，有参数了，就修改这一个地方就可以了。

        return new Student(99);
    }
}
