package test.java.design.pattern.creational.factory;

import main.java.design.pattern.FactoryAbout.factory.PEVideoFactory;
import main.java.design.pattern.FactoryAbout.factory.Video;
import main.java.design.pattern.FactoryAbout.factory.VideoFactory;

public class VideoTest {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PEVideoFactory();
        Video videos = videoFactory.getVideos();
        videos.procedure();

    }
}
