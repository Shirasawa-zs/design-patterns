package test.java.design.pattern.creational.abstract_factory;

import main.java.design.pattern.FactoryAbout.abstract_factory.*;

public class abstract_factory_Test {
    public static void main(String[] args) {
        System.out.println("=============小米系列=============");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Phone phone = xiaomiFactory.getPhone();
        phone.callup();
        phone.sendSMS();
        Router router = xiaomiFactory.getRouter();
        router.openWifi();
        System.out.println("=============华为系列=============");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        phone = huaweiFactory.getPhone();
        phone.callup();
        phone.sendSMS();
        router = huaweiFactory.getRouter();
        router.openWifi();
        System.out.println("=============oppo系列=============");
        oppoFactory oppoFactory = new oppoFactory();
        phone = oppoFactory.getPhone();
        phone.callup();
    }
}
