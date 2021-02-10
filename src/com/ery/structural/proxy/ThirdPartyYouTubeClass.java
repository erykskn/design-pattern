package com.ery.structural.proxy;

import java.util.HashMap;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib{
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("www.youtube.com");
        return getRandomVideos();
    }

    @Override
    public Video getVideo(String videoId) {
        connectToServer("www.youtube.com" + videoId);
        return getVideoById(videoId);
    }

    private Video getVideoById(String videoId) {
        System.out.println("Downloading video...");
        experienceNetworkLatency();
        Video video = new Video(videoId, "Video Title");
        System.out.println("Downloaded video!");
        return video;
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.println("Downloading popular videos...");
        experienceNetworkLatency();

        HashMap<String, Video> videoHashMap = new HashMap<>();
        videoHashMap.put("video1", new Video("video1", "Cats"));
        videoHashMap.put("video2", new Video("video2", "Dogs"));
        videoHashMap.put("video3", new Video("video3", "Rabbits"));
        videoHashMap.put("video4", new Video("video4", "Cars"));
        videoHashMap.put("video5", new Video("video5", "Houses"));
        videoHashMap.put("video6", new Video("video6", "People"));

        System.out.println("Downloaded!");

        return videoHashMap;

    }

    private void experienceNetworkLatency(){
        int latency = random(5,10);

        for (int i = 0; i < latency; i++) {
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

    }

    private void connectToServer(String server) {
        System.out.println("COnnecting to server: " + server + ".........");
        experienceNetworkLatency();
        System.out.println("Connected to server:" + server + "..........");
    }

    private int random(int min, int max) {
        return min + (int)(Math.random() * ((max - min) + 1) );
    }


}
