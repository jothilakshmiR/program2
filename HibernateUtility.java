package com.program.Employee;


	import org.hibernate.HibernateException;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	
	import org.hibernate.cfg.Configuration;
	import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
	 
	public class HibernateUtility {

	 
	    private static SessionFactory sessionFactory = null;
	 
	    static {
	        try{
	            loadSessionFactory();
	        }catch(Exception e){
	            System.err.println("Exception while initializing hibernate util.. ");
	            e.printStackTrace();
	        }
	    }
	 
	    public static void loadSessionFactory(){
	 
	    	Configuration con = new Configuration().configure().addAnnotatedClass(Work.class);
	        ServiceRegistry reg =  new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	        SessionFactory sf =con.buildSessionFactory(reg);
	    }
	 
	    public static Session getSession() throws HibernateException {
	 
	        Session retSession=null;
	            try {
	                retSession=sessionFactory.openSession();
	            }catch(Throwable t){
	            System.err.println("Exception while getting session.. ");
	            t.printStackTrace();
	            }
	            if(retSession == null) {
	                System.err.println("session is discovered null");
	            }
	 
	            return retSession;
	    }
	}


