package com.ery.behavioral.Strategy;

public class SocialMediaContext {
    private ISocialMediaStrategy iSocialMediaStrategy;

    public SocialMediaContext(ISocialMediaStrategy iSocialMediaStrategy) {
        this.iSocialMediaStrategy = iSocialMediaStrategy;
    }
    public void connect(String name){
        iSocialMediaStrategy.connect(name);
    }
}
