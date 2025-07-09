package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorSrvice;

@RestController
public class DoctorController {
	@Autowired
	DoctorSrvice ds;

	@PostMapping("Doctor")
	String addDoctor(@RequestBody Doctor d) {
		ds.addDoctor(d);
		return "Teacher Added";
	}

	@GetMapping("Doctor/{doctorId}")
	Doctor getDoctor(@PathVariable int doctorId) {
		return ds.getDoctor(doctorId);
	}
	@DeleteMapping("Doctor/{doctorId}")
	String deleteDoctor(@PathVariable int doctorId) {
		ds.deleteDoctor(doctorId);
		return "Doctor is Deleted";
		
	}

}
