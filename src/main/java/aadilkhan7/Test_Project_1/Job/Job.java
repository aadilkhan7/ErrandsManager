package aadilkhan7.Test_Project_1.Job;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import aadilkhan7.Test_Project_1.Errand.Errand;
import aadilkhan7.Test_Project_1.Errand.ErrandService;
import aadilkhan7.Test_Project_1.User.User;
import aadilkhan7.Test_Project_1.User.UserService;

@Entity
@Table(name = "JOBS")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int jobId;	
	@Column(name = "AssignedToUserId")
	int assignedToUserId;
	@Column(name = "PostedByUserId")
	int postedByUserId;
	@Column(name = "ErrandId")
	int errandId;

	Job() {

	}

	public Job(int assignedToUserId, int postedByUserId, int errandId) {
		super();
		this.assignedToUserId = assignedToUserId;
		this.postedByUserId = postedByUserId;
		this.errandId = errandId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public int getAssignedToUserId() {
		return assignedToUserId;
	}

	public void setAssignedToUserId(int assignedToUserId) {
		this.assignedToUserId = assignedToUserId;
	}

	public int getPostedByUserId() {
		return postedByUserId;
	}

	public void setPostedByUserId(int postedByUserId) {
		this.postedByUserId = postedByUserId;
	}

	public int getErrandId() {
		return errandId;
	}

	public void setErrandId(int errandId) {
		this.errandId = errandId;
	}

}
