package com.spring.services;

import com.SpringWithController.entity.Courses;

import java.util.List;

public interface CoursesService {
    public List<Courses> getCourses(long l);
    public Course getCourse(long courseId);
    <Course> Course getCourse(String courseId);
}
