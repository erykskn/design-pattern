package com.ery.structural.proxy;

import java.util.HashMap;

public class YouTubeDownloader {

    private ThirdPartyYouTubeLib api;

    public YouTubeDownloader(ThirdPartyYouTubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n-----------------");
        System.out.println("Video Page");
        System.out.println("ID:" + video.getId());
        System.out.println("Title:" + video.getTitle());
        System.out.println("Video:" + video.getData());
        System.out.println("\n-----------------");

    }

    public void renderPopularVideos(){
        HashMap<String, Video> videoHashMap = api.popularVideos();
        System.out.println("\n-----------------");
        System.out.println("Most popular videos on YouTube");

        for (Video video : videoHashMap.values()) {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        }
        System.out.println("\n-----------------");
    }
}
