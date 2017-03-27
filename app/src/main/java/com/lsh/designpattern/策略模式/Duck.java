package com.lsh.designpattern.策略模式;

/**
 * Created by "小灰灰"
 * on 27/3/2017 10:06
 * 邮箱：www.adonis_lsh.com
 */

public abstract class Duck {
    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    //每个鸭子长的都不一样
    public abstract void dispaly();

    //每个鸭子都有叫声和飞行两个属性有可能不一样
    public void performFly() {
        //委托给行为类
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        mFlyBehavior = flyBehavior;
    }

    //所有的鸭子都会游泳
    public void swim() {
        System.out.println("所有的鸭子都会游泳");
    }
}
