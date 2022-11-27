package main.java.design.pattern.FactoryAboutOthers.factory;

public class PEVideoFactory extends VideoFactory{
    @Override
    public Video getVideos() {
        return new PEVideo();
    }
}
