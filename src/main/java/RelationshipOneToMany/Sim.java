package RelationshipOneToMany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sim
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int simId;
	private String simType;
	private double simCost;
	public int getSimId() {
		return simId;
	}
	public void setSimId(int simId) {
		this.simId = simId;
	}
	public String getSimType() {
		return simType;
	}
	public void setSimType(String simType) {
		this.simType = simType;
	}
	public double getSimCost() {
		return simCost;
	}
	public void setSimCost(double simCost) {
		this.simCost = simCost;
	}
	
	

}
