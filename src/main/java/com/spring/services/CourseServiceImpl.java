package com.spring.services;

import com.SpringWithController.entity.Courses;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
class CourseServiceImpl implements CoursesService{

    List<Courses> list;
    public CourseServiceImpl()
    {
        list=new ArrayList<>();
        list.add(new Courses(1618,"Java Course","This is Java Assignment with controller and API"));

    }

    @Override
    public List<Courses> getCourses(long l) {
        return null;
    }

    @Override
    public Course getCourse(long courseId) {
        return null;
    }

    @Override
    public <Course> Course getCourse(String courseId) {
        return null;
    }
}
