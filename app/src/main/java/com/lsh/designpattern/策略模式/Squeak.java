package com.lsh.designpattern.策略模式;

/**
 * Created by "小灰灰"
 * on 27/3/2017 10:23
 * 邮箱：www.adonis_lsh.com
 */

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
