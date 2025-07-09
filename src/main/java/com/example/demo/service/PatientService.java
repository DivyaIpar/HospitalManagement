package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepository;

@Service
public class PatientService {
	@Autowired
	PatientRepository repository;

	public void addPatient(Patient p) {
		repository.save(p);
	}

	public void deletePatient(int patientId) {
		repository.deleteById(patientId);
	}

	public Patient getPatient(int pateintId) {
		return repository.findById(pateintId).get();
	}

}
