package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doctor;

public interface DoctoeRepository extends JpaRepository<Doctor, Integer>{

}
