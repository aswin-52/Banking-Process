package manyTomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainDriver 
{
  public static void main(String[] args) 
   {
	    EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
	    
//		Application app=new Application();
//		app.setName("Instragram");
//		app.setCategory("Social");
//		app.setCost(50);
//		
//		Application app1=new Application();
//		app1.setName("faceBook");
//		app1.setCategory("Social");
//		app1.setCost(100);
//		
//		Application app2=new Application();
//		app2.setName("Discard");
//		app2.setCategory("Social");
//		app2.setCost(150);
//		
//		Person p1=new Person();
//		p1.setName("vimal");
//		List<Application>apps=new ArrayList<Application>();
//		apps.add(app);
//		apps.add(app1);
//		apps.add(app2);
//		p1.setApps(apps);
//		
//		Person p2=new Person();
//		p2.setName("RAM");
//		List<Application>appss=new ArrayList<Application>();
//		appss.add(app);
//		appss.add(app2);
//		p2.setApps(appss);
//		
//		Person p3=new Person();
//		p3.setName("Amit");
//		List<Application>appss1=new ArrayList<Application>();
//		appss1.add(app);
//		appss1.add(app1);
//		appss1.add(app2);
//		
//		p3.setApps(appss1);
//		
//		
//		et.begin();
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
//		et.commit();

		
		Person p1=em.find(Person.class, 2);
		p1.setApps(null);
		
		et.begin();
		em.merge(p1);
		et.commit();
		
		
		
   }
}
