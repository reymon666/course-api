package my.springBoot.courseAPI.Lesson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(){
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findAll().forEach(lessons:: add);
        return lessons;
    }

    public List<Lesson> getAllLessonsByCourseId(String courseId){
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId).forEach(lessons:: add);
        return lessons;
    }

    public Lesson getLesson(String id){
        return lessonRepository.findOne(id);
    }

    public boolean addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
        return true;
    }

    public boolean updateLesson(Lesson lesson) {
        lessonRepository.save(lesson);
        return true;
    }

    public boolean deleteLesson(String id) {
        lessonRepository.delete(id);
        return true;
    }
}
