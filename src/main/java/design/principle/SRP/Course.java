package main.java.design.principle.SRP;

public class Course {
    public void study(String coursename){
        if("直播课".equals(coursename)){
            System.out.println(coursename + "不能快进");
        }else{
            System.out.println(coursename + "可以反复观看");
        }
    }
}
