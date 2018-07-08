package aadilkhan7.Test_Project_1.User;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	User findByEmail(String email);

}
