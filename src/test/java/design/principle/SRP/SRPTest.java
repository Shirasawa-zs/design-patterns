package test.java.design.principle.SRP;

import main.java.design.principle.SRP.Course;

public class SRPTest {
    public static void main(String[] args) {
        //1，原版代码
//        Course course = new Course();
//        course.study("直播课");
//        course.study("录播课");

        //2.单一职责
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
    }
}
