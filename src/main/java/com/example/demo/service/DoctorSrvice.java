package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctoeRepository;
@Service
public class DoctorSrvice {
@Autowired
	DoctoeRepository repository;
	public void addDoctor(Doctor d) {
		repository.save(d);
	}
	public void deleteDoctor(int doctorId) {
		repository.deleteById(doctorId);
	}
	public Doctor getDoctor(int doctorId) {
		return repository.findById(doctorId).get();
	}
}
