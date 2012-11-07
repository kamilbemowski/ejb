package pl.testejb.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import pl.testejb.dao.interfaces.JobDaoRemote;
import pl.testejb.entity.Jobs;

public class Client {

	/**
	 * @param args
	 */
	    public static void main(String[] args) {
	        Properties props = new Properties();
	        props.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
	        props.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
	        try {
	            Context ctx = new InitialContext(props);
	            JobDaoRemote jobDAO = (JobDaoRemote) ctx.lookup("JobDAO/remote");
	            Jobs job = new Jobs();
	            job.setJobId("LUK_DYR");
	            job.setJobTitle("Dyrektor");
	            jobDAO.add(job);
	        } catch (NamingException e) {
	            e.printStackTrace();
	        }
	}


}
