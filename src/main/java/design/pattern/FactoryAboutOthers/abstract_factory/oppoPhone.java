package main.java.design.pattern.FactoryAboutOthers.abstract_factory;

public class oppoPhone implements Phone{
    @Override
    public void callup() {
        System.out.println("oppo call ... ");
    }

    @Override
    public void sendSMS() {
        System.out.println("send message ... ");
    }
}
