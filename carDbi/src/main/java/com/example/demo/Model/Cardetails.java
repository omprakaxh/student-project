package com.example.demo.Model;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cardetails {
	@Id
	private int id ;
	private String carname ;
	private String color ;
	private String brand ;
	
	public void setId(int id) {
		this.id = id;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Cardetails [id=" + id + ", carname=" + carname + ", color=" + color + ", brand=" + brand + "]";
	}
	
	
	
	

}
