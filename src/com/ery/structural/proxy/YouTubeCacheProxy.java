package com.ery.structural.proxy;

import java.util.HashMap;

public class YouTubeCacheProxy implements ThirdPartyYouTubeLib{

    private ThirdPartyYouTubeLib youTubeService;
    private HashMap<String, Video> cachePopular = new HashMap<>();
    private HashMap<String, Video> cacheALl = new HashMap<>();

    public YouTubeCacheProxy() {
        this.youTubeService = new ThirdPartyYouTubeClass();
    }


    @Override
    public HashMap<String, Video> popularVideos() {
        if (cachePopular.isEmpty()){
            cachePopular = youTubeService.popularVideos();
        }else{
            System.out.println("Retreivel list from cache!");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video =  cacheALl.get(videoId);
        if (video == null){
            video = youTubeService.getVideo(videoId);
            cachePopular.put(videoId, video);
        }else{
            System.out.println("Retreivel video: " + videoId + " from cache!");
        }

        return video;
    }

    public void reset(){
        cachePopular.clear();
        cacheALl.clear();
    }
}
