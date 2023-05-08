package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.Customer;

import jakarta.transaction.Transactional;

public interface Customerrepository extends JpaRepository<Customer,Integer>{


	@Query("select s from Customer s where s.custname=?1")
	List<Customer> getCarsByName(String custname);
	@Modifying
	@Transactional
	@Query(value="delete from Customer cus where cus.id=?1")
	public void deleteById(@Param("id") int id,@Param("caar") String caar) ;
    
}
