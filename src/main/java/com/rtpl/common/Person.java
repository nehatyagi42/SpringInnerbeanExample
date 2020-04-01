package com.rtpl.common;

public class Person {
private String Name;
private String Address;
private int age;
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Person [Name=" + Name + ", Address=" + Address + ", age=" + age + "]";
}

	
	
}
