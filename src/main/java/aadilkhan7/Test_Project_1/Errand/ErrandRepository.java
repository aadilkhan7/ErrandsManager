package aadilkhan7.Test_Project_1.Errand;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ErrandRepository extends CrudRepository<Errand, Integer>  {
	
	
	List<Errand> findByPostedByUserId(int id);
	
}
