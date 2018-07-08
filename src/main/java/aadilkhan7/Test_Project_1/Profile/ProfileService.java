package aadilkhan7.Test_Project_1.Profile;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aadilkhan7.Test_Project_1.Errand.Errand;
import aadilkhan7.Test_Project_1.Errand.ErrandRepository;
import aadilkhan7.Test_Project_1.Errand.ErrandService;
import aadilkhan7.Test_Project_1.Job.Job;
import aadilkhan7.Test_Project_1.Job.JobService;
import aadilkhan7.Test_Project_1.User.User;
import aadilkhan7.Test_Project_1.User.UserService;

@Service
public class ProfileService {
	
	@Autowired
	UserService userService;
	@Autowired
	JobService jobService;
	@Autowired
	ErrandService errandService;
	
	public Profile getProfile(String userEmail) {
		User u = userService.findByEmail(userEmail);
		List<Job> jobs = jobService.getJobsAssignedToMe(u.getId());
		
		List<Errand> assignedErrands = new ArrayList<>();
		
		for(Job j : jobs) {
			assignedErrands.add(errandService.getErrand(j.getErrandId()));
		}		
		
		Profile p = new Profile(u, assignedErrands);		
		return p;
	}

}
