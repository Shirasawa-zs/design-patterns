package main.java.design.pattern.creational.abstract_factory;

public class XiaomiPhone implements Phone{
    @Override
    public void callup() {
        System.out.println("小米手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("小米手机发短信");
    }

}
