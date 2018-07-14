package aadilkhan7.Test_Project_1.Errand;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ERRANDS")
public class Errand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int errandId;
	@Column(name = "Description")
	String description;
	@Column(name = "DueDate")
	String dueDate;
	@Column(name = "Reward")
	String reward;
	@Column(name = "Location")
	String location;
	@Column(name = "PostedByUserId")
	int postedByUserId;
	
	
	Errand(){
		
	}

	public Errand(String description, String dueDate, String reward, String location, int postedByUserId) {
		super();
		this.description = description;
		this.dueDate = dueDate;
		this.reward = reward;
		this.location = location;
		this.postedByUserId = postedByUserId;
		
	}

	public int getErrandId() {
		return errandId;
	}

	public void setErrandId(int errandId) {
		this.errandId = errandId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public String getReward() {
		return reward;
	}

	public void setReward(String reward) {
		this.reward = reward;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getPostedByUserId() {
		return postedByUserId;
	}

	public void setPostedByUserId(int postedByUserId) {
		this.postedByUserId = postedByUserId;
	}
	
	
	
	
	

}
