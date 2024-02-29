package com.Leave_Management.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Leave_Management.Entities.LeaveEn;
import com.Leave_Management.Repository.LeaveRepository;
@Service
public class LeaveService {
	@Autowired
	private LeaveRepository lRepo;
	
	public void save(LeaveEn l) {
		lRepo.save(l);
	}
	
	public List<LeaveEn> getAllLeave(){
		return lRepo.findAll();
	}
	
	public LeaveEn getLeaveById(int emp_id) {
		return lRepo.findById(emp_id).get();
	}
	public void deleteById(int id) {
		lRepo.deleteById(id);
	}

}
