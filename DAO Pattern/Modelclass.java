package com.journaldev.spring.jdbc.model;

public class Engineer {

	private int id;
	private String name;
	private String company;
  	private String field_of_engineering;
  	private int working_hours;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

  	public String getField_of_engineering() {
		return field_of_engineering;
	}
	public void setField_of_engineering(String field_of_engineering) {
		this.field_of_engineering = field_of_engineering;
	}

  	public int getWorking_hours() {
		return working_hours;
	}
	public void setWorking_hours(int working_hours) {
		this.working_hours = working_hours;
	}
  
	@Override
	public String toString(){
		return "{ID=" + id + ", Name=" + name + ", Company=" + company + ", Field_of_engineering=" + field_of_engineering + ", Working_hours=" + working_hours + "}";
	}
}
