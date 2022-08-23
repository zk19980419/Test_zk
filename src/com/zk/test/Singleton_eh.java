package com.zk.test;
/*
* Singleton:在java中即指单例设计模式，它是软件开发最常用的设计模式之一。
* 单例设计模式：即某个类在整个系统中只能有一个实例对象可以被h获取h和使用的代码模式。
*例如：在JVM运行环境的RunTime类
*
* 一是某个类只能有一个实例
*   构造器私有化
* 二是它必须自行创建这个实例
*   含有一个该类的静态变量来保存这个唯一实例
* 三是它必须自行向整个系统提供这个实例
*   对外提供获取该实例对象的方式
*   1.直接暴露public 2.用静态变量的get方式获取
*
* 饿汉式：直接创建对象，不存在线程安全的问题
*   直接实例化饿汉式（简洁直观）
*   枚举式（最简洁）
*   静态代码块饿汉式（适合复杂实例化）
*
* */
public class Singleton_eh {
    //1
    public static final Singleton_eh INSTANCE = new Singleton_eh();
    private Singleton_eh(){
    }


}
