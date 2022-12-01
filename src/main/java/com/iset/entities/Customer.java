package com.iset.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String serviceRendered;
    private String address;
    
    public Customer(long id, String name, String serviceRendered, String address) {
		super();
		this.id = id;
		this.name = name;
		this.serviceRendered = serviceRendered;
		this.address = address;
	}
    
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getServiceRendered() {
		return serviceRendered;
	}
	
	public void setServiceRendered(String serviceRendered) {
		this.serviceRendered = serviceRendered;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    

}
