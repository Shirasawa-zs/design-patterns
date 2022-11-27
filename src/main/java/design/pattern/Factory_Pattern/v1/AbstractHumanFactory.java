package main.java.design.pattern.Factory_Pattern.v1;

public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}