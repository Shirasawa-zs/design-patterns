package main.java.design.pattern.Singleton_Pattern.v2;

import com.sun.org.apache.regexp.internal.RE;

public class Singleton {
    private static Singleton singleton = null;

    //限制产生多个对象
    private Singleton(){

    }

    //懒汉式，考虑加锁实现多线程情况
    public static synchronized  Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }

    //类中其他方法进来static
    public static void doSomething(){
        
    }
}
