package main.java.design.pattern.creational.abstract_factory;

public class HuaweiFactory implements ProductFactory{
    @Override
    public Phone getPhone() {
        return new HuaweiPhone();
    }

    @Override
    public Router getRouter() {
        return new HuaweiRouter();
    }

}
