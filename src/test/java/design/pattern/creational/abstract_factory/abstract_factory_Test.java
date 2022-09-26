package test.java.design.pattern.creational.abstract_factory;

import main.java.design.pattern.creational.abstract_factory.HuaweiFactory;
import main.java.design.pattern.creational.abstract_factory.Phone;
import main.java.design.pattern.creational.abstract_factory.Router;
import main.java.design.pattern.creational.abstract_factory.XiaomiFactory;

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

    }
}
