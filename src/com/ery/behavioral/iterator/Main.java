package com.ery.behavioral.iterator;

public class Main {
    public static void main(String[] args) {
        Topic[] topics = new Topic[5];
        for (int i = 0; i < 5; i++) {
            topics[i] = new Topic("Topic " + i);
        }

        List<Topic> topicList = new TopicList(topics);

        Iterator<Topic> iterator = topicList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }
}

