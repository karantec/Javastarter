package com.practice.entiy;

public class User {
	private String name;
	private Long mobileNumber;
	private byte age;

	public void workout() {
		System.out.println(name + " is working out");
	}
	public void workoutOver() {
		System.out.println(name  + "workout over");
	}
	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[name=" + name + "]";

	}

}
