package com.lsh.designpattern.策略模式;

/**
 * Created by "小灰灰"
 * on 27/3/2017 10:21
 * 邮箱：www.adonis_lsh.com
 */

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("我不会发声");
    }
}
