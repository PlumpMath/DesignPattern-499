package com.lsh.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.lsh.designpattern.策略模式.Duck;
import com.lsh.designpattern.策略模式.FlyWithSwing;
import com.lsh.designpattern.策略模式.Mallard;
import com.lsh.designpattern.策略模式.ModelDuck;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void strategypattern(View view) {
        Duck mallard = new Mallard();
        mallard.performFly();
        mallard.performQuack();
        mallard.dispaly();
        // =======================================
        // ============= 模型鸭子  ==============
        // =======================================
        System.out.println("------------------华丽分割线------------------");
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithSwing());
        modelDuck.performFly();
    }
}
