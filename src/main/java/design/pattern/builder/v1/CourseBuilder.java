package main.java.design.pattern.builder.v1;

public abstract class CourseBuilder {
//    private  String CourseName;
//    private String CoursePPT;
//    private String CourseVideo;
//    private String CourseArticle;
//    private String CourseQA;
    public abstract void bulidCourseName(String CourseName);
    public abstract void bulidCoursePPT(String CoursePPT);
    public abstract void bulidCourseVideo(String CourseVideo);
    public abstract void bulidCourseArticle(String CourseArticle);
    public abstract void bulidCourseAQ(String CourseQA);

    public abstract Course makeCourse();
}
