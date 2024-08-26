package BankProject;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Manager 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String M_city;
	private long cont;
	@OneToOne(cascade = CascadeType.ALL)
	Bank bank;
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
	public String getM_city() {
		return M_city;
	}
	public void setM_city(String m_city) {
		M_city = m_city;
	}
	public long getCont() {
		return cont;
	}
	public void setCont(long cont) {
		this.cont = cont;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", M_city=" + M_city + ", cont=" + cont + ", bank=" + bank
				+ "]";
	}
	
	
	

}
