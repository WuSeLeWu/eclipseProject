package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.ICourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {
	private ICourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(ICourseDao courseDao,Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers=loggers;
	}

	List<Course> courses=new ArrayList<Course>();
	public void add(Course course,List<Course> courses) throws Exception {
		for(Course curs: courses) {
			if (curs.getCourseName()==course.getCourseName()) {
				throw new Exception("Aynı isimde 2 adet kurs olamaz!");
			}
		}
		if (course.getUnitPrice()<0) {
			throw new Exception("Bir kursun ücreti 0'dan küçük olamaz!");
		}
		
		courses.add(course);
		courseDao.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	public void update(Course course) {
		courseDao.update(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
	
	public void delete(Course course) {
		courseDao.delete(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
