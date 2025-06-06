package com.acts;

public class Student {
	private int rollNo;
	private String name;
	private String course;
	
	//Student has Address so creating ref. of Address class in this class
	private Address address;
	
	public Student() {
		this.rollNo = 0;
		this.name = "";
		this.course = "";
		this.address = null;
	}


	public Student(int rollNo, String name, String course, Address address) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.address = address;
	}


	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}
	
	
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public String getString() {
		return "Student : rollNo =" + rollNo + " name =" + name
				+ " course= " + course +" [" + address.getString() +"]";
	}

}
