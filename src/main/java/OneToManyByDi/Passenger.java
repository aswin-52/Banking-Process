package OneToManyByDi;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Passenger 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private long cont;

@ManyToOne
private Car passengerCar;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getCont() {
	return cont;
}

public void setCont(long cont) {
	this.cont = cont;
}

public Car getPassenger() {
	return passengerCar;
}

public void setPassenger(Car passenger) {
	this.passengerCar = passenger;
}

@Override
public String toString() {
	return "Passenger [id=" + id + ", name=" + name + ", cont=" + cont + ", passenger=" + passengerCar + "]";
}



}
