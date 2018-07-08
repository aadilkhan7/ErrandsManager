package aadilkhan7.Test_Project_1.Errand;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrandService {
	
	@Autowired
	private ErrandRepository errandRepository;
	
	//Returns ALL Errands in ERRAND table
	public List<Errand> getAllErrands(){
		List<Errand> errands = new ArrayList<Errand>();
		errandRepository.findAll().forEach(errands::add);
		return errands;
	}
	
	
	public void addErrand(Errand e) {
		errandRepository.save(e);		
	}


	public List<Errand> getErrandsBypostedByUserId(int postedByUserId) {
		List<Errand> errandsByPostedByUserId = new ArrayList<Errand>();
		errandRepository.findByPostedByUserId(postedByUserId).forEach(errandsByPostedByUserId::add);		
		return errandsByPostedByUserId;		
	}
	
	public Errand getErrand(int id){
		return errandRepository.findOne(id);
	}

}
