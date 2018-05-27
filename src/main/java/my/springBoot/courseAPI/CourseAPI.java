package my.springBoot.courseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class CourseAPI {
    public static void main(String ar[]){
        SpringApplication.run(CourseAPI.class, ar);
    }
}
