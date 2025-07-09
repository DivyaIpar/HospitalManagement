package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repo.AppointmentRepository;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository repository;

	public void addAppointment(Appointment a) {
		repository.save(a);
	}

	public void deleteAppointment(int appontmentId) {
		repository.findById(appontmentId);
	}

	public Appointment getAppointment(int appointmentId) {
		return repository.findById(appointmentId).get();
	}

}
