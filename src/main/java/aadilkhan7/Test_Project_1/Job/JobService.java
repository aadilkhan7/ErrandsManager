package aadilkhan7.Test_Project_1.Job;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService {
	
	@Autowired
	JobRepository jobRepository;
	
	public List<Job> getJobsAssignedToMe(int userId){
		List<Job> jobsAssignedToMe = new ArrayList<>();
		jobRepository.findByAssignedToUserId(userId).forEach(jobsAssignedToMe::add);
		return jobsAssignedToMe;
	}
	
	public int addJob(Job j) {
		jobRepository.save(j);		
		return 0;
	}
	
	
	
	public int deleteJob() {
		return 0;
	}
	
	
	
	
	

}
