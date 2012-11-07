package pl.testejb.dao;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pl.testejb.dao.interfaces.JobDaoLocal;
import pl.testejb.dao.interfaces.JobDaoRemote;
import pl.testejb.entity.Jobs;

@Stateless
@Remote(value = JobDaoRemote.class)
public class JobDao implements JobDaoRemote, JobDaoLocal{

	@PersistenceContext
	EntityManager em;

	public void add(Jobs jobs) {
		em.persist(jobs);
	}

}
