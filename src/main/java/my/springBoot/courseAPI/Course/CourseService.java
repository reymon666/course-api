package my.springBoot.courseAPI.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(){
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses:: add);
        return courses;
    }

    public List<Course> getAllCoursesByTopicId(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses:: add);
        return courses;
    }

    public Course getCourse(String id){
        return courseRepository.findOne(id);
    }

    public boolean addCourse(Course course) {
        courseRepository.save(course);
        return true;
    }

    public boolean updateCourse(Course course) {
        courseRepository.save(course);
        return true;
    }

    public boolean deleteCourse(String id) {
        courseRepository.delete(id);
        return true;
    }
}
