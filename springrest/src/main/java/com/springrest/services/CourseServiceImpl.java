package com.springrest.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.dao.CourseDao;
import com.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	
	
	@Autowired	
	private CourseDao courseDao;

	public CourseServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Course(101, "Core java", "This is Core Java Course"));
//		list.add(new Course(102, "Spring", "This is Spring Course"));

	}

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
//		Course c = null;
//		for (Course course : list) {
//			if (course.getId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.getById(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		//list.add(course);
		return courseDao.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
//		list.forEach(e -> {
//			if (e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		return courseDao.save(course);
	}
	
	
	@Override
	public void deleteCourse(long parseLong) {
	 //list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
		Optional<Course> entity = courseDao.findById(parseLong);
		courseDao.delete(entity.orElseThrow());
	}

}
