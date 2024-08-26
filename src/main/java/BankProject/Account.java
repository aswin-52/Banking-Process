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
public class Account 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String type;
  private double Balance;
  private long Number;
  @OneToOne(cascade = CascadeType.ALL)
  private Customer customer;
  @OneToMany(cascade = CascadeType.ALL)
  private  List<Transaction>transaction;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getBalance() {
	return Balance;
}
public void setBalance(double balance) {
	Balance = balance;
}
public long getNumber() {
	return Number;
}
public void setNumber(long number) {
	Number = number;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public List<Transaction> getTransaction() {
	return transaction;
}
public void setTransaction(List<Transaction> transaction) {
	this.transaction = transaction;
}
@Override
public String toString() {
	return "Account [id=" + id + ", type=" + type + ", Balance=" + Balance + ", Number=" + Number + ", customer="
			+ customer + ", transaction=" + transaction + "]";
}
  
  

}
