package main.java.design.pattern.FactoryAboutOthers.abstract_factory;

public class XiaomiFactory implements ProductFactory{
    @Override
    public Phone getPhone() {
        return new XiaomiPhone();
    }

    @Override
    public Router getRouter() {

        return new XiaomiRouter();
    }
}
