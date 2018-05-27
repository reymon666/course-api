package my.springBoot.courseAPI.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import my.springBoot.courseAPI.Topic.Topic;

import java.util.List;

@CrossOrigin
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/courses")
    public List<Course> sendResponse(){

        return courseService.getAllCourses();
    }

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCoursesByTopicId(@PathVariable String id){

        return courseService.getAllCoursesByTopicId(id);
    }

    @GetMapping("topics/{topicId}/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @PostMapping("topics/{topicId}/courses")
    public boolean addCourse(@RequestBody Course course, @PathVariable String topicId){

        course.setTopic(new Topic(topicId, "", ""));
        return courseService.addCourse(course);
    }

    @PutMapping("topics/{topicId}/courses/{id}")
    public boolean updateCourse(@RequestBody Course course, @PathVariable String id,  @PathVariable String topicId){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("topics/{topicId}/courses/{id}")
    public boolean deleteCourse(@PathVariable String id){
        return courseService.deleteCourse(id);
    }
}