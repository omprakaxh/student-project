package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.Carrepository;
import com.example.demo.Repository.Customerrepository;

import jakarta.transaction.Transactional;

import com.example.demo.Model.Cardetails;
import com.example.demo.Model.Customer;

@Service

public class Serviceclass {
	
	@Autowired
	public Carrepository cp ;
	@Autowired 
	public Customerrepository cr;
	 public List<Customer> getall()
	   {
		   return cr.findAll();
	   }
	   public Customer saveinfo(Customer mc)
	   {
		   return cr.save(mc);
	   }
	   public void delete(int id)
	   {
		   cr.deleteById(id);
	   }
	   public Customer Update(Customer mc)
	   {
		   return cr.saveAndFlush(mc);
	   }
	public List<Customer> getCars(String custname) {
	
		 return cr.getCarsByName(custname);	}
    public String deleteQuery(int id)
    {
    	cr.deleteById(id);
    	return "deleted";
    }


}
