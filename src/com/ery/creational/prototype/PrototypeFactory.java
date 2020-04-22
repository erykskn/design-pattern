package com.ery.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    public static class ModelType {
        public static final String MOVIE = "Movie";
        public static final String SHOW = "Show";
        public static final String ALBUM = "Album";
    }

    private static Map<String, PrototypeCapable> map = new HashMap<String, PrototypeCapable>();

    static {
        map.put(ModelType.MOVIE, new Movie());
        map.put(ModelType.SHOW, new Show());
        map.put(ModelType.ALBUM, new Album());
    }

    public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
        return ((PrototypeCapable) map.get(s)).clone();
    }
}
