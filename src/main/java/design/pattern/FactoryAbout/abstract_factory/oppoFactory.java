package main.java.design.pattern.FactoryAbout.abstract_factory;

public class oppoFactory implements  ProductFactory{
    @Override
    public Phone getPhone() {
        return new oppoPhone();
    }

    @Override
    public Router getRouter() {
        return new oppoRoute();
    }
}
