package main.java.design.pattern.FactoryAbout.factory;

public class PEVideoFactory extends VideoFactory{
    @Override
    public Video getVideos() {
        return new PEVideo();
    }
}
