package test.java.design.pattern.creational.factory;

import main.java.design.pattern.creational.factory.PEVideoFactory;
import main.java.design.pattern.creational.factory.Video;
import main.java.design.pattern.creational.factory.VideoFactory;

public class VideoTest {
    public static void main(String[] args) {
        VideoFactory videoFactory = new PEVideoFactory();
        Video videos = videoFactory.getVideos();
        videos.procedure();

    }
}
