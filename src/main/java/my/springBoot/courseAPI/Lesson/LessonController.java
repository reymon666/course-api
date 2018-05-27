package my.springBoot.courseAPI.Lesson;

import my.springBoot.courseAPI.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping("/topics/courses/lessons")
    public List<Lesson> getAllLessons(){

        return lessonService.getAllLessons();
    }

    @GetMapping("/topics/{topicId}/courses/{id}/lessons")
    public List<Lesson> getAllLessonsByCourseId(@PathVariable String id){

        return lessonService.getAllLessonsByCourseId(id);
    }

    @GetMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public Lesson getLesson(@PathVariable String id){
        return lessonService.getLesson(id);
    }

    @PostMapping("topics/{topicId}/courses/{courseId}/lessons")
    public boolean addLesson(@RequestBody Lesson lesson, @PathVariable String courseId){

        lesson.setCourse(new Course(courseId, "", ""));
        return lessonService.addLesson(lesson);
    }

    @PutMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public boolean updateLesson(@RequestBody Lesson lesson, @PathVariable String id, @PathVariable String courseId){
        return lessonService.updateLesson(lesson);
    }

    @DeleteMapping("topics/{topicId}/courses/{courseId}/lessons/{id}")
    public boolean deleteLesson(@PathVariable String id){
        return lessonService.deleteLesson(id);
    }
}