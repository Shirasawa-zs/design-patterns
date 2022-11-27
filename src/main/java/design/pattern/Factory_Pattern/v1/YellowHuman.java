package main.java.design.pattern.Factory_Pattern.v1;

public class YellowHuman implements Human {
    public void getColor(){
        System.out.println("黄色人种的皮肤颜色是黄色的！");
    }
    public void talk() {
        System.out.println("黄色人种会说话，一般说的都是双字节。");
    }
}