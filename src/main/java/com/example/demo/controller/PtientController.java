package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PtientController {
	@Autowired
	PatientService ps;

	@PostMapping("patient")
	String addPatient(@RequestBody Patient p) {
		ps.addPatient(p);
		return "Patient is Added";
	}

	@GetMapping("patient/{patientId}")
	Patient getPatient(@PathVariable int patientId) {
		return ps.getPatient(patientId);
	}

	@DeleteMapping("patient/{patientId}")
	String deletePatient(@PathVariable int patientId) {
		ps.deletePatient(patientId);
		return "Ptient is Deleted";
	}

}
