package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int id ;
	private String custname ;
	private String custnum ;
	private String custcar ;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Cardetails> model ;
	public List<Cardetails> getModel() {
		return model;
	}
	public void setModel(List<Cardetails> model) {
		this.model = model;
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustnum() {
		return custnum;
	}
	public void setCustnum(String custnum) {
		this.custnum = custnum;
	}
	public String getCustcar() {
		return custcar;
	}
	public void setCustcar(String custcar) {
		this.custcar = custcar;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", custname=" + custname + ", custnum=" + custnum + ", custcar=" + custcar + "]";
	}
	
	

}
