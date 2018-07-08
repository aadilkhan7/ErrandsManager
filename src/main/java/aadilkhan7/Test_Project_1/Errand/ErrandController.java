package aadilkhan7.Test_Project_1.Errand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrandController {
	
	@Autowired
	private ErrandService errandService;
	
	
	@RequestMapping("/getallerrands")
	public List<Errand> getUnassignedErrands(){
		return errandService.getAllErrands();		
	}
	
	@RequestMapping(method=RequestMethod.POST, value = "/addErrand")
	public void addErrand(@RequestBody Errand e) {
		errandService.addErrand(e);
	}
	
	@RequestMapping("/myerrands/{postedByUserId}")
	public List<Errand> getErrandsByPostedByUserId(@PathVariable int postedByUserId){
		return errandService.getErrandsBypostedByUserId(postedByUserId);
	}
	
	
}
