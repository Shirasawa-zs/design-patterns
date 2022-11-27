package main.java.design.pattern.FactoryAboutOthers.simple_factory;



public class CourceFactory {

    public static void GetCources(Cource cource){
        cource.study();
    }

    public Cource getCource(Class cls) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Cource cls1 = (Cource) Class.forName(cls.getName()).newInstance();
        return cls1;
    }
}
