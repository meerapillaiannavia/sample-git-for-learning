package org.xyz.model;

public class user {
	
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "user [name=" + name + "]";
	}
			

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
			
}
