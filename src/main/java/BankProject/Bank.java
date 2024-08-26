package BankProject;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bank 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String B_name;
	private long IFSC;
	private String city;
	private long cont;
	@OneToOne(cascade = CascadeType.ALL)
	private Manager manager;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Customer>customer;
	
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getB_name() {
		return B_name;
	}
	public void setB_name(String b_name) {
		B_name = b_name;
	}
	public long getIFSC() {
		return IFSC;
	}
	public void setIFSC(long iFSC) {
		IFSC = iFSC;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getCont() {
		return cont;
	}
	public void setCont(long cont) {
		this.cont = cont;
	}
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", B_name=" + B_name + ", IFSC=" + IFSC + ", city=" + city + ", cont=" + cont
				+ ", manager=" + manager + ", customer=" + customer + "]";
	}
	
	
	
	
	

}
