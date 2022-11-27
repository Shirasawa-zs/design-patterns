package main.java.design.pattern.FactoryAboutOthers.abstract_factory;

public class HuaweiPhone implements Phone{
    @Override
    public void callup() {
        System.out.println("华为手机打电话");
    }

    @Override
    public void sendSMS() {
        System.out.println("华为手机发短信");
    }

}
