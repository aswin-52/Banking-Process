package Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDao {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		StudentDto std=new StudentDto();
		std.setName("ram");
		std.setCont(345678902);
		std.setMail("ram@gmail.com");
		
		et.begin();
		em.persist(std);
		et.commit();

	}

}
