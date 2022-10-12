package kodlamaioDemo.business;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.IInstructorDao;
import kodlamaioDemo.entities.Instructor;

public class InstructorManager {
	private IInstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(IInstructorDao instructorDao, Logger[] loggers) {
		super();
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	
	public void update(Instructor instructor) {
		instructorDao.update(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	
	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	

}
