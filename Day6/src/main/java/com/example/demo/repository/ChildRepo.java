package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ChildDetails;

public interface ChildRepo extends JpaRepository<ChildDetails,Integer>{

}
