package BankProject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Transaction
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private double tr_amount;
	private String Status;
	private int usr_id;
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
	public double getTr_amount() {
		return tr_amount;
	}
	public void setTr_amount(double tr_amount) {
		this.tr_amount = tr_amount;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public int getUsr_id() {
		return usr_id;
	}
	public void setUsr_id(int usr_id) {
		this.usr_id = usr_id;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", type=" + type + ", tr_amount=" + tr_amount + ", Status=" + Status
				+ ", usr_id=" + usr_id + "]";
	}
	
	

}
