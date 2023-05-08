package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Customer;
import com.example.demo.Service.Serviceclass;


@RestController

public class Controllerclass {
	@Autowired
	public Serviceclass scl ;
	 @GetMapping("/cardetails")
	   public List<Customer> displayall()
	   {
		   return scl.getall();
	   }
	   @PostMapping("/save")
	   public Customer adddetails(@RequestBody Customer mc)
	   {
		   return scl.saveinfo(mc);
	   }
	   @DeleteMapping("/delete/{id}")
	   public String Deleteoption(@PathVariable int id)
	   {
		   scl.delete(id);
		   return "deleted";
	   }
	   @PutMapping("/update")
		public Customer Update(@RequestBody Customer mc)
		{
		   return scl.Update(mc);
		}
	  
	   @GetMapping("/Displayquery")
	    public List<Customer>fetchqueryCar(@RequestParam String custname )
	    {
	    	return scl.getCars(custname);
	    }
	   @DeleteMapping("/deleteQuery")
	    public String deleteCars(@RequestParam int id)
	    {
		   return scl.deleteQuery(id);
	    }



	

}
