package Persistencia;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Controller.Valores;



import Persistencia.HibernateUtil;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


public class ValoresDAO {
	
		
	
	
	    
	    
	    public ValoresDAO() {
	    	//factory = Persistence.createEntityManagerFactory("crudHibernate");
		    //entityManager = factory.createEntityManager();
	    
	    }
	    
	    public ValoresDAO(int i) {
	    	
	    
	    }
	    
	    public void imprimir () {
	    	System.out.println ("oi mundo");
	    }
	    
	
	
	    public void salvar(Valores item) {
	        try {
	        	   SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory(); 
		           Session session = factory.openSession();        
		           Transaction tx = session.beginTransaction();      
		           session.save(item);        
		           tx.commit();  
		           
	        } catch (Exception ex) {
	                 ex.printStackTrace();
	                // entityManager.getTransaction().rollback();
	        }
	   }
	    
	    public void listar (Valores item) {
	        try {
	        	   SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory(); 
		           Session session = factory.openSession();        
		           Transaction tx = session.beginTransaction();
		           session.load(item,item.getIdvalores());    
		           tx.commit();  
		           
	        } catch (Exception ex) {
	                 ex.printStackTrace();
	                // entityManager.getTransaction().rollback();
	        }
	   }
	    
	    
	    
	    public void alterar(Valores item) {
	        try {
	        	   SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory(); 
		           Session session = factory.openSession();        
		           Transaction tx = session.beginTransaction();
		           session.update(item);        
		           tx.commit();    
	        } catch (Exception ex) {
	                 ex.printStackTrace();
	                // entityManager.getTransaction().rollback();
	        }
	   }
	    
	    
	    public void excluir(Valores item) {
	        try {
	        	   SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory(); 
		           Session session = factory.openSession();        
		           Transaction tx = session.beginTransaction();      
		           session.delete(item);        
		           tx.commit();
	        } catch (Exception ex) {
	                 ex.printStackTrace();
	                // entityManager.getTransaction().rollback();
	        }
	   }
	    
	    
	   
	    
	    
}