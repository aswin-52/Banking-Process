package RelationshipOneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Phone 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private	int phoneId;
private	String phnoeBrand;
private	String phoneRam;

@OneToMany(cascade = CascadeType.ALL)
private List<Sim>simcard;

public int getPhoneId() {
	return phoneId;
}
public void setPhoneId(int phoneId) {
	this.phoneId = phoneId;
}
public String getPhnoeBrand() {
	return phnoeBrand;
}
public void setPhnoeBrand(String phnoeBrand) {
	this.phnoeBrand = phnoeBrand;
}
public String getPhoneRam() {
	return phoneRam;
}
public void setPhoneRam(String phoneRam) {
	this.phoneRam = phoneRam;
}
public List<Sim> getSimcard() {
	return simcard;
}
public void setSimcard(List<Sim> simcard) {
	this.simcard = simcard;
}

@Override
public String toString() {
	return "Phone [phoneId=" + phoneId + ", phnoeBrand=" + phnoeBrand + ", phoneRam=" + phoneRam + ", simcard="
			+ simcard + "]";
}




}
