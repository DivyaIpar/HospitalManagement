package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Staff;
import com.example.demo.repo.StaffRepository;
@Service
public class StaffService {
	@Autowired
	StaffRepository repository;
	public void addStaff(Staff s) {
		repository.save(s);
	}
	public void deleteStaff(int staffId) {
		repository.deleteById(staffId);
	}
	public Staff getStaff(int staffId) {
		return repository.findById(staffId).get();
	}
	
	

}
