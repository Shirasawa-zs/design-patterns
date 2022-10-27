package main.java.design.pattern.builder.v1;

public class CourseActualBuilder extends CourseBuilder{
    private  Course course = new Course();
    @Override
    public void bulidCourseName(String CourseName) {
        course.setCourseName(CourseName);
    }

    @Override
    public void bulidCoursePPT(String CoursePPT) {
        course.setCoursePPT(CoursePPT);
    }

    @Override
    public void bulidCourseVideo(String CourseVideo) {
        course.setCourseVideo(CourseVideo);
    }

    @Override
    public void bulidCourseArticle(String CourseArticle) {
        course.setCourseArticle(CourseArticle);
    }

    @Override
    public void bulidCourseAQ(String CourseQA) {
        course.setCourseQA(CourseQA);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
