package main.java.design.pattern.creational.abstract_factory;

public class oppoRoute implements Router{
    @Override
    public void openWifi() {
        System.out.println("oppo wifi");
    }

    @Override
    public void setting() {
        System.out.println("oppo setting");
    }
}
