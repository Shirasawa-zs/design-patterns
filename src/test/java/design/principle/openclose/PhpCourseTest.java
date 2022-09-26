package test.java.design.principle.openclose;

import main.java.design.principle.openclose.ICourse;
import main.java.design.principle.openclose.PhpCourse;
import main.java.design.principle.openclose.PhpCourseDistcount;

public class PhpCourseTest {
    public static void main(String[] args) {
        ICourse iCourse = new PhpCourseDistcount(1, "php", 9000d);
        //此时我们如果想新增一个折扣发现如果直接动接口或者对象方法会造成代码的不稳定
        PhpCourseDistcount phpCourseDistcount = (PhpCourseDistcount)iCourse;
        System.out.println("id = "+ phpCourseDistcount.getID() + " ，name = " + phpCourseDistcount.getName() + "，price = " + phpCourseDistcount.getPrice());
    }
}
