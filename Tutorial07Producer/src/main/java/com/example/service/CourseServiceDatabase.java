package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentMapper;
import com.example.model.CourseModel;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CourseServiceDatabase implements CourseService
{
    @Autowired
    private StudentMapper studentMapper;


	@Override
    public CourseModel selectCourse (String id)
    {
        log.info ("select course with id {}", id);
        return studentMapper.selectCourse (id);
    }


    @Override
    public List<CourseModel> selectAllCourse ()
    {
        log.info ("select all course");
        return studentMapper.selectAllCourses ();
    }

	

}
