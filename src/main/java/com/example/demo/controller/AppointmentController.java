package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	AppointmentService as;

	@PostMapping("Appointment")
	String addAppointment(@RequestBody Appointment A) {
		as.addAppointment(A);
		return "Appointment is Added";
	}

	@GetMapping("Appointment/{appointmentId}")
	Appointment getAppointment(@PathVariable int appointmentId) {
		return as.getAppointment(appointmentId);
	}

	@DeleteMapping("Appointment/{appointmentId}")
	String deleteAppointment(@PathVariable int appointmentId) {
		as.deleteAppointment(appointmentId);
		return " Appointment is Deleted";
	}

}
