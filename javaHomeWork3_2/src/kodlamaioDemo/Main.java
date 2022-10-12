package kodlamaioDemo;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.HibernateDao;
import kodlamaioDemo.dataAccess.JdbcDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers= {new DatabaseLogger()};
		
								//Kategori İşlemleri
		CategoryManager categoryManager=new CategoryManager(new HibernateDao(),loggers);
		List<Category> categories = new ArrayList<Category>();
		Category category=new Category(1,"Programlama");
		Category category2=new Category(2,"Ücretsizler");
		
		categoryManager.add(category,categories);
		categoryManager.add(category2,categories);
		categoryManager.update(category);
		categoryManager.delete(category2);
		System.out.println("");
		System.out.println("");
		
		
								//Kurs İşlemleri
		CourseManager courseManager=new CourseManager(new JdbcDao(),loggers);
		List<Course> courses = new ArrayList<Course>();
		Course course=new Course(1,"C#","Engin Demiroğ",0);
		Course course2=new Course(2,"Java","Engin Demiroğ",0);
		
		courseManager.add(course,courses);
		courseManager.add(course2,courses);
		courseManager.update(course);
		courseManager.delete(course2);
		System.out.println("");
		System.out.println("");
		
		
								//Eğitmen İşlemleri
		InstructorManager instructorManager=new InstructorManager(new HibernateDao(), loggers);
		Instructor instructor=new Instructor(1,"Engin","DEMİROĞ");
		Instructor instructor2=new Instructor(2,"Engin","DEMİROĞ");
		
		instructorManager.add(instructor);
		instructorManager.add(instructor2);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		

	}

}
