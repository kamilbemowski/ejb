package pl.testejb.dao.interfaces;

import javax.ejb.Local;

import pl.testejb.entity.Jobs;

@Local
public interface JobDaoLocal {
	public void add(Jobs jobs);

}
