package employees;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeDao 
{
	public static void main(String[] args)
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
//		save
		
		EmployeesDto emp=new EmployeesDto();
		emp.setName("Aswin");
		emp.setCond(1234567890);
		emp.setEmail("aswin@gmail.com");
		
		et.begin();
		em.persist(emp);
		et.commit();
		System.out.println(emp);
		
//		find
		
//		EmployeesDto emp=em.find(EmployeesDto.class, 2);
//		System.out.println(emp);

//		delete
//		EmployeesDto emp=em.find(EmployeesDto.class, 2);
//		et.begin();
//		em.remove(emp);
//		et.commit();
		
//		EmployeesDto emp=em.find(EmployeesDto.class, 1);
//		emp.setCond(361009259);
//		et.begin();
//		System.out.println(em.merge(emp));
//		et.commit();
		
		
		
	}

}
