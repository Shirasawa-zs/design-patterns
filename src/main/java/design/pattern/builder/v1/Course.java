package main.java.design.pattern.builder.v1;

public class Course {
    private  String CourseName;
    private String CoursePPT;
    private String CourseVideo;
    private String CourseArticle;
    private String CourseQA;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCoursePPT() {
        return CoursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        CoursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return CourseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        CourseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return CourseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        CourseArticle = courseArticle;
    }

    public String getCourseQA() {
        return CourseQA;
    }

    public void setCourseQA(String courseQA) {
        CourseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                ", CoursePPT='" + CoursePPT + '\'' +
                ", CourseVideo='" + CourseVideo + '\'' +
                ", CourseArticle='" + CourseArticle + '\'' +
                ", CourseQA='" + CourseQA + '\'' +
                '}';
    }
}
