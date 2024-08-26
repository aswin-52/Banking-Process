package RelationshipOneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SimDriver
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Sim s1=new Sim();
//		s1.setSimType("4G");
//		s1.setSimCost(100);
//		
//		Sim s2=new Sim();
//		s2.setSimType("5G");
//		s2.setSimCost(100);
//		
//		Phone p1=new Phone();
//		p1.setPhnoeBrand("samsang");
//		p1.setPhoneRam("8GB");
//		
//		List<Sim>sims=new ArrayList<Sim>();
//		sims.add(s1);
//		sims.add(s2);
//		
//		p1.setSimcard(sims);
//		
//	    et.begin();
//		em.persist(p1);
//		et.commit();
		
//		Delete
		
//		Phone p= em.find(Phone.class, 1);
//		et.begin();
//		em.remove(p);
//		et.commit();
		
		Phone p= em.find(Phone.class, 2);
		List<Sim>sims=p.getSimcard();
		
		List<Sim>newlist=new ArrayList<Sim>();
		
		for(Sim s:sims)
		{
			if(s.getSimId()==2)
			{
				newlist.add(s);
			}
		}
		
			p.setSimcard(newlist);
			et.begin();
			em.merge(p);
			et.commit();
		}
		
		
	}


