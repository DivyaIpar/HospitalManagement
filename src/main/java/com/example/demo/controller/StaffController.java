package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Staff;
import com.example.demo.service.StaffService;

@RestController
public class StaffController {
	@Autowired
	StaffService ss;

	@PostMapping("staff")
	String addStaff(@RequestBody Staff s) {
		ss.addStaff(s);
		return "Staff is Added";
	}

	@GetMapping("staff/{staffId}")
	Staff getStaff(@PathVariable int staffId) {
		return ss.getStaff(staffId);
	}

	@DeleteMapping("staff/{staffId}")
	String deleteStaff(@PathVariable int staffId) {
		ss.deleteStaff(staffId);
		return "Staff is deleted";
	}

}
