package main.java.design.pattern.FactoryAboutOthers.factory;

public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideos() {
        return new JavaVideo();
    }
}
