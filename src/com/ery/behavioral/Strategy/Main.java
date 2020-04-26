package com.ery.behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        SocialMediaContext facebookContext = new SocialMediaContext(new FacebookStrategy());
        facebookContext.connect("Eray");

        SocialMediaContext twitterContext = new SocialMediaContext(new TwitterStrategy());
        twitterContext.connect("Eray");
    }
}
