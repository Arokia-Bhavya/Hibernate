package com.training.hb;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "employee")
public class Employee { 
@Id
private int Id;  
@Override
public String toString() {
	return "Employee [Id=" + Id + ", name=" + name + "]";
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
private String name;  
  
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


  
}  
