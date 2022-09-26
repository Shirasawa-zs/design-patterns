package test.java.design.principle.DIP;

import main.java.design.principle.DIP.Java;
import main.java.design.principle.DIP.Mary;
import main.java.design.principle.DIP.Python;

public class DIPTest {
    public static void main(String[] args) {
        //1.原始实现
//        Mary mary = new Mary();
//        mary.Java();
//        mary.Python();

        //2.依赖注入
//        Mary mary = new Mary();
//        mary.cource(new Java());
//        mary.cource(new Python());

        //3.构造器注入
//        Mary mary = new Mary(new Java());
//        mary.cource();
//        Mary mary1 = new Mary(new Python());
//        mary1.cource();

        //4.setter注入
        Mary mary = new Mary();
        mary.setiCource(new Java());
        mary.cource();
        mary.setiCource(new Python());
        mary.cource();
    }
}
