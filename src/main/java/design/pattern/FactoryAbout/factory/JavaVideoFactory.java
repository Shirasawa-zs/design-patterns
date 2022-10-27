package main.java.design.pattern.FactoryAbout.factory;

public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideos() {
        return new JavaVideo();
    }
}
