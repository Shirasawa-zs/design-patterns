package main.java.design.principle.DIP;

public class Mary {

    //1 基本实现
//    public void Java(){
//        System.out.println("Mary喜欢java");
//    }
//
//    public void Python(){
//        System.out.println("Mary喜欢java");
//    }

    //2 依赖注入
//    public void cource(ICource iCource){
//        iCource.study();
//    }

    //3 构造器注入
//    private ICource iCource;
//
//    public Mary(ICource iCource) {
//        this.iCource = iCource;
//    }
//
//    public void cource(){
//        iCource.study();
//    }

    private  ICource iCource;

    public void setiCource(ICource iCource) {
        this.iCource = iCource;
    }

        public void cource(){
        iCource.study();
    }
}
