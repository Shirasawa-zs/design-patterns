package main.java.design.pattern.Singleton_Pattern.v1;

public class Emperor {
    private static final Emperor emperor = new Emperor();

    //初始化
    private Emperor(){
        //不希望产生第二个皇帝
    }

    public static Emperor getInstance(){
        return emperor;
    }

    //皇帝说话
    public static void say(){
        System.out.println("我是皇帝xxx");
    }
}
