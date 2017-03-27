package com.lsh.designpattern.策略模式;

/**
 * Created by "小灰灰"
 * on 27/3/2017 10:15
 * 邮箱：www.adonis_lsh.com
 */

public class FlyWithSwing implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我会飞");
    }
}
