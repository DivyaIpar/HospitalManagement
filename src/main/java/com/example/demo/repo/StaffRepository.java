package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Staff;

public interface StaffRepository extends JpaRepository<Staff, Integer>{

}
