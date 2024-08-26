package OneToManyByDi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Driver
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
//		Car car=new Car();
//		car.setBrand("jaguvar");
//		car.setPrice(230000);
//		
//		Passenger p1=new Passenger();
//		p1.setName("vimal");
//		p1.setCont(1234567890);
//		p1.setPassenger(car);
//		
//		
//		Passenger p2=new Passenger();
//		p2.setName("sri");
//		p2.setCont(1234567890);
//		p2.setPassenger(car);
//		
//		Passenger p3=new Passenger();
//		p3.setName("Win");
//		p3.setCont(1234567890);
//		p3.setPassenger(car);
//		
//		List<Passenger>passenger=new ArrayList<Passenger>();
//		passenger.add(p1);
//		passenger.add(p2);
//		passenger.add(p3);
//		
//		car.setPassengers(passenger);
//		
//		et.begin();
//		em.persist(car);
//		et.commit();
		
//		Car car=new Car();
//		car.setBrand("BMW");
//		car.setPrice(450000);
//		
//		Passenger p1=new Passenger();
//		p1.setName("Kaml");
//		p1.setCont(1234567890);
//		p1.setPassenger(car);
//		
//		Passenger p2=new Passenger();
//		p2.setName("Kaml");
//		p2.setCont(1234567890);
//		p2.setPassenger(car);
//		
//		Passenger p3=new Passenger();
//		p3.setName("Kaml");
//		p3.setCont(1234567890);
//		p3.setPassenger(car);
//		
//		List<Passenger>passenger=new ArrayList<Passenger>();
//    	passenger.add(p1);
//		passenger.add(p2);
//		passenger.add(p3);
//		
//		car.setPassengers(passenger);
//		
//		et.begin();
//		em.persist(car);
//		et.commit();

		
//		from car(id=1)remove Passenger(id=3)
//		
//		Car car=em.find(Car.class, 3);
//		
//		List<Passenger>allpass=car.getPassengers();
//		List<Passenger>newList=new ArrayList<Passenger>();
//		
//		for(Passenger p:allpass)
//		{
//			if(p.getId()==9)
//			{
//				p.setPassenger(null);
//				et.begin();
//				em.merge(p);
//				et.commit();
//			}
//			else
//			{
//				newList.add(p);
//			}
//		}
//		
//		car.setPassengers(newList);
//		et.begin();
//		em.merge(car);
//		et.commit();

//	Add passenger (id=3)to car(id=2)
		
//		Passenger p=em.find(Passenger.class, 3);
//		Car car=em.find(Car.class, 2);
//		p.setPassenger(car);
//		car.getPassengers().add(p);
//		et.begin();
//		em.merge(p);
//		em.merge(car);
//		et.commit();
		
		
//		add a new car passenger to car(\id=1)
//		
//		Passenger p=new Passenger();
//		p.setName("kalai");
//		p.setCont(1234567890);
//		
//		Car car=em.find(Car.class, 1);
//		p.setPassenger(car);
//		car.getPassengers().add(p);
//		
//		et.begin();
//		em.merge(car);
//		et.commit();
		
//		Car c1=new Car();
//		c1.setBrand("BMW");
//		c1.setPrice(4500000);
//		
//		Car c2=new Car();
//		c2.setBrand("HONDA");
//		c2.setPrice(4500000);
		
		
		
//		Passenger p1=new Passenger();
//		p1.setName("Aswin");
//		p1.setCont(1234567890);
//		p1.setPassenger(c1);
//		
//		Passenger p2=new Passenger();
//		p2.setName("MOHAN");
//		p2.setCont(1234567890);
//		p2.setPassenger(c1);
//		
//		Passenger p3=new Passenger();
//		p3.setName("RAJ");
//		p3.setCont(1234567890);
//		p3.setPassenger(c1);
		
//		Passenger p4=new Passenger();
//		p4.setName("Sri");
//		p4.setCont(1234567890);
//		p4.setPassenger(c2);
//		
//		Passenger p5=new Passenger();
//		p5.setName("VICKY");
//		p5.setCont(1234567890);
//		p5.setPassenger(c2);
//		
//		Passenger p6=new Passenger();
//		p6.setName("DHARANI");
//		p6.setCont(1234567890);
//		p6.setPassenger(c2);
		
//		List<Passenger>passenger=new ArrayList<Passenger>();
//		passenger.add(p1);
//		passenger.add(p2);
//		passenger.add(p3);
//		passenger.add(p4);
//		passenger.add(p5);
//		passenger.add(p6);
		
		
//		c1.setPassengers(passenger);
//		c2.setPassengers(passenger);
		
//		et.begin();
//		em.persist(c1);
//		em.persist(c2);
//		et.commit();
		
		
//	Save car(id=3)with no passenger
		
//		Car c3=new Car();
//		c3.setBrand("KIA");
//		c3.setPrice(560000);
//		c3.setPassengers(null);
//		
//	et.begin();
//	em.persist(c3);
//	et.commit();

		
//		Find a passenger whose name is "XZY" and add him to car(id=3)
		
	Query query=em.createQuery("select p from Passenger p where p.name=?1");
	query.setParameter(1, "RAJ");
	
	Passenger p=(Passenger) query.getSingleResult();
	System.out.println(p);
	
//	Car c=em.find(Car.class, 3);
//	p.set
//	c.get
		
		
		
		
		
		
		
		
		
		


		
		
	}

}
