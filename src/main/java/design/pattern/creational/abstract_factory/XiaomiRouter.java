package main.java.design.pattern.creational.abstract_factory;

public class XiaomiRouter implements Router {
    @Override
    public void openWifi() {
        System.out.println("小米路由器打开WiFi");
    }

    @Override
    public void setting() {
        System.out.println("小米路由器设置");
    }
}