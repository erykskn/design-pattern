package com.ery.structural.proxy;

public class Proxy {
    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYouTubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YouTubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);
        System.out.println("Time saved bu caching proxy: " + (naive - smart) + " ms");
    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        //user behavior in our app
        downloader.renderPopularVideos();
        downloader.renderVideoPage("video1");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("video2");

        //users might visit the same page quite often
        downloader.renderVideoPage("video1");
        downloader.renderVideoPage("video2");


        long estimatedtime = System.currentTimeMillis() - startTime;
        return estimatedtime;
    }
}
