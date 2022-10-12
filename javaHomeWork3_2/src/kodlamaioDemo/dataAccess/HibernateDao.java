package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class HibernateDao implements ICategoryDao,ICourseDao,IInstructorDao{
	
	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile Id'si "+instructor.getId()+" olan eklendi");
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Hibernate ile Id'si "+instructor.getId()+" olan güncellendi");
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Hibernate ile Id'si "+instructor.getId()+" olan silindi");
		
	}

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile "+course.getCourseName()+" eklendi");
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile "+course.getCourseName()+" güncellendi");
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile "+course.getCourseName()+" silindi");
		
	}

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile "+category.getName()+" eklendi");
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile "+category.getName()+" güncellendi");
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile "+category.getName()+" silindi");
		
	}
	
}
