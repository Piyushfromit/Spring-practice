package com.masai;

public class Person {

	    private int Person_id;
		private String name;
		private String mobile;
		private String email;
		private int age;

	@Override
	public String toString() {
		return "Person{" +
				"Person_id=" + Person_id +
				", name='" + name + '\'' +
				", mobile='" + mobile + '\'' +
				", email='" + email + '\'' +
				", age=" + age +
				'}';
	}

	public Person() {
			super();
		}
		public Person(int Person_id, String name, String mobile, String email, int age) {
			super();
			this.Person_id = Person_id;
			this.name = name;
			this.mobile = mobile;
			this.email = email;
			this.age = age;
		}

	public int getPerson_id() {
		return Person_id;
	}

	public void setPerson_id(int person_id) {
		Person_id = person_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
