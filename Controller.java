import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    @Autowired
    private CourseService service;

    @GetMapping
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return service.createCourse(course);
    }
}
