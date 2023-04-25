package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.StudentModel.Modelclass;
import com.example.demo.service.serviceclass;

@RestController
public class controllerclass {
   @Autowired
   public serviceclass scl;
   @GetMapping("/cardetails")
   public List<Modelclass> displayall()
   {
	   return scl.getall();
   }
   @PostMapping("/save")
   public Modelclass adddetails(@RequestBody Modelclass mc)
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
	public Modelclass Update(@RequestBody Modelclass mc)
	{
	   return scl.Update(mc);

	}

   
}
