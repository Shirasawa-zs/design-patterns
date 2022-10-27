package main.java.design.pattern.Singleton_Pattern.v1;

public class Minister {
    public static void main(String[] args) {
        for(int day = 0; day < 3; day++){
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
