package com.lsh.designpattern.策略模式;

/**
 * Created by "小灰灰"
 * on 27/3/2017 10:26
 * 邮箱：www.adonis_lsh.com
 */

public class Mallard extends Duck {
    public Mallard() {
        mFlyBehavior = new FlyWithSwing();
        mQuackBehavior = new Squeak();
    }

    @Override
    public void dispaly() {
        System.out.println("我拥有野鸭子的外貌");
    }
}
