package com.ycm.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    //by right we need to query the database, for now we hard code the list
    private List<Topic> topics = new ArrayList<>();

    public TopicService() {
        topics.addAll(Arrays.asList(
                new Topic("spring","spring framework","spring framework description"),
                new Topic("java","core java","core java description"),
                new Topic("javascript","javascript","javascript description")
        ));
    }

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        //for (Topic t : topics) { if (t.getId().equals(id)) return t; }
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i=0;i<topics.size();i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}
