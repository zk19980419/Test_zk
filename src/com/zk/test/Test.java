package com.zk.test;

public class Test {

    public static void main(String[] args) {
        Singleton_eh_enum s = Singleton_eh_enum.INSTANCE;
        System.out.println(s);

        Singleton_eh s1 = Singleton_eh.INSTANCE;
        System.out.println(s1);

        System.out.println("你好，轲轲");
        System.out.println("你好，婷婷");
        System.out.println("你好，hot-fix");
    }
}
