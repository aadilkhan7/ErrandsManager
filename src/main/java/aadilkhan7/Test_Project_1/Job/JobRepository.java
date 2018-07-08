package aadilkhan7.Test_Project_1.Job;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Integer>{
	
	public List<Job> findByAssignedToUserId(int id);
	
}
