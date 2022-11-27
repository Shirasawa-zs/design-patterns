package main.java.design.pattern.Bulider_Pattern.v2;

import main.java.design.pattern.Bulider_Pattern.v1.BMWModel;
import main.java.design.pattern.Bulider_Pattern.v1.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
