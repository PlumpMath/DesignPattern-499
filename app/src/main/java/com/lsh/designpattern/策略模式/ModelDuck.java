package com.lsh.designpattern.策略模式;

/**
 * Created by "小灰灰"
 * on 27/3/2017 11:01
 * 邮箱：www.adonis_lsh.com
 */

public class ModelDuck extends Duck {
    public ModelDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new MuteQuack();
    }

    @Override
    public void dispaly() {
        System.out.println("我是一个模型鸭子");
    }
}
