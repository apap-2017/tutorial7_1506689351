package com.example.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import com.example.model.CourseModel;


public interface CourseDAO {
	
	CourseModel selectCourse (@Param("id_course") String id_course);
    
   
    List<CourseModel> selectAllCourses ();
}
