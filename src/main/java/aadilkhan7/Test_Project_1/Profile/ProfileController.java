package aadilkhan7.Test_Project_1.Profile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aadilkhan7.Test_Project_1.Errand.Errand;
import aadilkhan7.Test_Project_1.Errand.ErrandService;
import aadilkhan7.Test_Project_1.User.User;
import aadilkhan7.Test_Project_1.User.UserService;

@RestController
public class ProfileController {
	
	@Autowired
	ProfileService profileService;
	
	
	@RequestMapping("profile/{userEmail}")
	public Profile getProfile(@PathVariable String userEmail){
		Profile p = profileService.getProfile(userEmail);
		return p;
	}
	
	

}
