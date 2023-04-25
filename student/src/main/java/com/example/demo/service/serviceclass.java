package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.StudentModel.Modelclass;
import com.example.demo.repository.carrepo;

@Service
public class serviceclass {
   @Autowired
   public carrepo cp;
   public List<Modelclass> getall()
   {
	   return cp.findAll();
   }
   public Modelclass saveinfo(Modelclass mc)
   {
	   return cp.save(mc);
   }
   public void delete(int id)
   {
	   cp.deleteById(id);
   }
   public Modelclass Update(Modelclass mc)
   {
	   return cp.saveAndFlush(mc);
   }
}
