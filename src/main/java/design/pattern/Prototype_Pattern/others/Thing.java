package main.java.design.pattern.Prototype_Pattern.others;

import java.util.ArrayList;

public class Thing implements Cloneable{

    //定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();


    //覆盖父类Object方法
    @Override
    public Thing clone(){
        Thing thing = null;
        try{
            thing = (Thing) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return thing;
    }

    //设置HashMap的值
    public void setValue(String value){
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue(){
        return this.arrayList;
    }

}
