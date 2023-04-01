package com.ashokit;

import java.io.Serializable;

public class Car implements Serializable {
private  Integer number;
private String name;
private double price;
public Integer getNumber() {
	return number;
}
public void setNumber(Integer number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

	
	
}
