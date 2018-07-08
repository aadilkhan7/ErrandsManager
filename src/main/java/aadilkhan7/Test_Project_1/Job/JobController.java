package aadilkhan7.Test_Project_1.Job;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {
	
	@Autowired
	JobService jobService;
	
	
	
	@RequestMapping(method=RequestMethod.POST, value="/addjob")
	public int addJob(@RequestBody Job j) {
		return jobService.addJob(j);
	}

}
