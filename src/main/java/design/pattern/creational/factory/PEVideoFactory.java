package main.java.design.pattern.creational.factory;

public class PEVideoFactory extends VideoFactory{
    @Override
    public Video getVideos() {
        return new PEVideo();
    }
}
