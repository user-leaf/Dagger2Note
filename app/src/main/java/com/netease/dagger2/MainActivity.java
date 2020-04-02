package com.netease.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Inject
    Student mStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // mStudent = new Student();

        // 把自己MainActivity---this 交给Dagger2
        DaggerStudentComponent.create().injectMainActivity(this); // 注入进去，mStudent就有值了
        // 就拿到Student的实例了

        Log.d(TAG, "onCreate: student.hashCode():"+ mStudent.hashCode() + "  student.name:"+mStudent.name);
    }
}
