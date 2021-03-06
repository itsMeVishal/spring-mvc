package com.websystique.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "family_info")
public class FamilyInfo {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@NotNull
	@Column(name="member_count")
	private int memberCount;
	@Column(name="family_income")
	@NotNull
	private double familyIncome;
	
}
