package com.lsh.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lsh.designpattern.策略模式.Duck;
import com.lsh.designpattern.策略模式.Mallard;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void strategypattern(View view) {
        Duck duck = new Mallard();
        duck.performFly();
        duck.performQuack();
        duck.dispaly();
    }
}
