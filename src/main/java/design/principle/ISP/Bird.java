package main.java.design.principle.ISP;

public class Bird implements ISwim,IFly{
    //1，单纯实现IAnimal接口要重写三个方法，有的可能并不需要
//    @Override
//    public void eat() {
//
//    }
//
//    @Override
//    public void fly() {
//
//    }
//
//    @Override
//    public void swim() {
//
//    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
