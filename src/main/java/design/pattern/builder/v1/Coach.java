package main.java.design.pattern.builder.v1;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }


    public  Course makeCourse(String CourseName, String CoursePPT, String CourseVideo, String CourseArticle, String CourseQA){
        this.courseBuilder.bulidCourseName(CourseName);
        this.courseBuilder.bulidCoursePPT(CoursePPT);
        this.courseBuilder.bulidCourseVideo(CourseVideo);
        this.courseBuilder.bulidCourseArticle(CourseArticle);
        this.courseBuilder.bulidCourseAQ(CourseQA);
        return this.courseBuilder.makeCourse();
    }
}
