package main.java.design.pattern.TemplateMethod_Pattern.v2;

public class Client {
    public static void main(String[] args) {
        //XX公司要H1型号的悍马
        HummerModel h1 = new HummerH1Model();
        //H1模型演示
        h1.run();
    }
}