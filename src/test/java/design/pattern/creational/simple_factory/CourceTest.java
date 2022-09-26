package test.java.design.pattern.creational.simple_factory;

import main.java.design.pattern.creational.simple_factory.Cource;
import main.java.design.pattern.creational.simple_factory.CourceFactory;
import main.java.design.pattern.creational.simple_factory.JavaCource;
import main.java.design.pattern.creational.simple_factory.PythonCource;

public class CourceTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        CourceFactory courceFactory = new CourceFactory();
        Cource cource = courceFactory.getCource(JavaCource.class);
        if(cource == null){
            System.out.println("失败了 QAQ");
        }
        cource.study();

        //非工厂模式，还是需要自己new
        CourceFactory.GetCources(new JavaCource());
    }
}
