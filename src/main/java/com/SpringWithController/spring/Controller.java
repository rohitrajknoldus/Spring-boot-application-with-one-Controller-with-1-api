package com.SpringWithController.spring;


import com.SpringWithController.entity.Courses;
import com.spring.services.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CoursesService coursesService;

    @GetMapping("/home")
    public String home() {
        return "Hello This is your Controller method";
    }

    //get the courses
    @GetMapping("/courses")
    public List<Courses> getCourses()
    {
        String courseId = null;
        return this.coursesService.getCourses(Long.parseLong(courseId));
    }
    @GetMapping("/courses/{coursesId")
    public Courses getCourses(@PathVariable String courseId){
        return (Courses) this.coursesService.getCourses(Long.parseLong(courseId));
    }
}
