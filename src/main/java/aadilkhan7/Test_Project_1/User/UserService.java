package aadilkhan7.Test_Project_1.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

	private UserRepository userRepository;
	
    @Autowired
    public UserService(UserRepository userRepository) { 
      this.userRepository = userRepository;
    }
    
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}

	public List<User> getAllUsers() {
		List<User> allUsers = new ArrayList<User>();
		Iterable<User> it = userRepository.findAll();
		for(Iterator<User> i = it.iterator(); i.hasNext();) {
			allUsers.add(i.next());
		}		
		return allUsers;
	}

}