package com.websystique.spring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employer")
public class Employer {

	@Id
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long employerId;
	
	String name;
	String address;
	Long strength;
	/*@OneToMany(cascade=CascadeType.ALL,mappedBy="employer")
	List<Employee> employee;*/
	
	
	/*public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getEmployerId() {
		return employerId;
	}
	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getStrength() {
		return strength;
	}
	public void setStrength(Long strength) {
		this.strength = strength;
	}
		
}

