package kodlamaioDemo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.ICategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {
	private ICategoryDao categoryDao;
	private Logger[] loggers;
	

	public CategoryManager(ICategoryDao categoryDao,Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;

	}

	List<Category> categories = new ArrayList<Category>();

	public void add(Category category,List<Category> categories) throws Exception {

		for (Category ctgs : categories) {
			if (ctgs.getName() == category.getName()) {
				throw new Exception("Bir kategori listesinde aynı isimden iki adet olamaz!");
			}
		}
		
		categories.add(category);
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	public void update(Category category) {
		categoryDao.update(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}
	
	public void delete(Category category) {
		categoryDao.delete(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	
}
