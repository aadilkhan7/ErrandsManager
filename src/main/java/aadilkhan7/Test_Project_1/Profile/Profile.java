package aadilkhan7.Test_Project_1.Profile;

import java.util.List;

import aadilkhan7.Test_Project_1.Errand.Errand;
import aadilkhan7.Test_Project_1.User.User;


public class Profile {
	
	User user;
	List<Errand> assignedJobs;
	
	Profile(){
		
	}
	
	Profile(User u, List<Errand> assignedJobs){
		super();
		this.user = u;
		this.assignedJobs = assignedJobs;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Errand> getAssignedJobs() {
		return assignedJobs;
	}
	public void setAssignedJobs(List<Errand> assignedJobs) {
		this.assignedJobs = assignedJobs;
	}
	
	

}
