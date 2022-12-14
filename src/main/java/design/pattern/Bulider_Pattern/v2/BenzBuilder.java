package main.java.design.pattern.Bulider_Pattern.v2;

import main.java.design.pattern.Bulider_Pattern.v1.BenzModel;
import main.java.design.pattern.Bulider_Pattern.v1.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

    private BenzModel benzModel = new BenzModel();
    @Override

    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
