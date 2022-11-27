package main.java.design.pattern.Bulider_Pattern.v2;

import main.java.design.pattern.Bulider_Pattern.v1.BMWModel;
import main.java.design.pattern.Bulider_Pattern.v1.BenzModel;

import java.util.ArrayList;

public class Client1 {
    public static void main(String[] args) {
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom");  //客户要求，run的时候先发动引擎
        sequence.add("start");  //启动起来
        sequence.add("stop");  //开了一段就停下来
        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel)benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();
        //按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel)bmwBuilder.getCarModel();
        bmw.run();
    }
}