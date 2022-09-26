package main.java.design.pattern.creational.factory;

public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideos() {
        return new JavaVideo();
    }
}
