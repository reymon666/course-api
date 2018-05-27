package my.springBoot.courseAPI.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> sendResponse(){

        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public boolean addTopic(@RequestBody Topic topic){
        return topicService.addTopic(topic);
    }

    @PutMapping("/topics/{id}")
    public boolean updateTopic(@RequestBody Topic topic, @PathVariable String id){
        return topicService.updateTopic(topic, id);
    }

    @DeleteMapping("/topics/{id}")
    public boolean deleteTopic(@PathVariable String id){
        return topicService.deleteTopic(id);
    }
}