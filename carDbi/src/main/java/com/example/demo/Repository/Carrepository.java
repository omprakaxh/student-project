package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Cardetails;

public interface Carrepository extends JpaRepository<Cardetails,Integer>{

}
