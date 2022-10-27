package main.java.design.pattern.Singleton_Pattern.standard;

public class Singleton {
    private static final Singleton singleton = new Singleton();

    //限制产生多个对象
    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }

    //类中其他方法进来static
    public static void doSomething(){

    }
}
