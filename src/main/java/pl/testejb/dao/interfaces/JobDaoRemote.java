package pl.testejb.dao.interfaces;

import javax.ejb.Remote;
import pl.testejb.entity.Jobs;

@Remote
public interface JobDaoRemote {
	public void add(Jobs jobs);

}
