package com.springboot.studyboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	// /courses
	@RequestMapping("/courses")
	public List<Course> retrieveAllCourses(){
		
		return Arrays.asList(
				new Course(1, "Learn Aws", "yoncho"),
				new Course(2, "Learn Aaa", "yoncho2"),
				new Course(3, "Learn azure", "yoncho3"),
				new Course(4, "Learn GCP", "yoncho3")
				);
	}
	
}
