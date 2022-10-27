package main.java.design.pattern.Prototype_Pattern.others;

import java.util.ArrayList;

public class ThingDept implements Cloneable{
    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();


    //覆盖父类Object方法
    @Override
    public ThingDept clone(){
        ThingDept thingDept = null;
        try{
            thingDept = (ThingDept) super.clone();
            thingDept.arrayList = (ArrayList<String>) this.arrayList.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thingDept;
    }

    //设置HashMap的值
    public void setValue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }
}
