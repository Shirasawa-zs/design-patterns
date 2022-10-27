package main.java.design.pattern.FactoryAbout.abstract_factory;

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
