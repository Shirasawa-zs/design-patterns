package main.java.design.pattern.Prototype_Pattern.standard;

public class PrototypeClass implements Cloneable{

    //覆盖父类Object方法
    @Override
    public PrototypeClass clone(){
        PrototypeClass prototypeClass = null;
        try{
            prototypeClass = (PrototypeClass) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
