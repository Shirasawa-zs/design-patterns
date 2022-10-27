package main.java.design.pattern.Prototype_Pattern.others;

public class Test {

    public static void main(String[] args) {
        //产生一个对象
        ThingDept thingDept = new ThingDept();

        //设置一个值
        thingDept.setValue("张三");

        //拷贝一个对象
        ThingDept cloneThing = thingDept.clone();

        cloneThing.setValue("李四");

        System.out.println(thingDept.getValue());
    }
}
