package my.springBoot.courseAPI.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("id", "name", "description"),
            new Topic("id2", "name2", "description2"),
            new Topic("id3", "name3", "description3")
    ));

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics :: add);
        return topics;
    }

    public Topic getTopic(String id){
        return topicRepository.findOne(id);
    }

    public boolean addTopic(Topic topic) {
        topicRepository.save(topic);
        return true;
    }

    public boolean updateTopic(Topic topic, String id) {
        topicRepository.save(topic);
        return true;
    }

    public boolean deleteTopic(String id) {
        topicRepository.delete(id);
        return true;
    }
}
