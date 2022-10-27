package test.java.design.pattern.creational.builder.v1;

import main.java.design.pattern.builder.v1.Coach;
import main.java.design.pattern.builder.v1.Course;
import main.java.design.pattern.builder.v1.CourseActualBuilder;
import main.java.design.pattern.builder.v1.CourseBuilder;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("1", "2", "3", "4", "5");
        System.out.println(course);
    }
}
