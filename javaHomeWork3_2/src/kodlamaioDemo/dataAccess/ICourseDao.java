package kodlamaioDemo.dataAccess;

import kodlamaioDemo.entities.Course;

public interface ICourseDao {
	void add(Course course);

	void update(Course course);

	void delete(Course course);
}
