package main.java.design.principle.LoD;

import test.java.design.principle.SRP.LiveCourse;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checknum(){
        List<Course> courseList = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            courseList.add(new Course());
        }
        System.out.println(courseList.size());
    }
}
