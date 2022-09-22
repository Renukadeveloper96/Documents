package com.detail.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empolyeerenuka")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	
	@Column(name="employee_id")
	private long id;
	
	@Column(name="employee_name")
	private String name;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="organisation")
	private String organisation;
	
	public Employee() {}

	
	public Employee(long id, String name, String designation, String organisation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.organisation = organisation;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getOrganisation() {
		return organisation;
	}

	public void setOrganisation(String organisation) {
		this.organisation = organisation;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", organisation="
				+ organisation + "]";
	}
	
	
}
