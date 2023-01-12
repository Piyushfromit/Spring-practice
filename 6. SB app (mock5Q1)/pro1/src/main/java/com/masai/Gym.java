package com.masai;

public class Gym {


	private int gym_id;
	private String gym_name;
	private int fee;
	   

	   
	   
	   
	   
	   
	   
	public Gym() {
		super();
	}
	
	@Override
	public String toString() {
		return "Gym{" +
				"gym_id=" + gym_id +
				", gym_name='" + gym_name + '\'' +
				", fee=" + fee +
				'}';
	}

	public Gym(int gym_id, String gym_name, int fee) {
		this.gym_id = gym_id;
		this.gym_name = gym_name;
		this.fee = fee;
	}

	public int getGym_id() {
		return gym_id;
	}

	public void setGym_id(int gym_id) {
		this.gym_id = gym_id;
	}

	public String getGym_name() {
		return gym_name;
	}

	public void setGym_name(String gym_name) {
		this.gym_name = gym_name;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
}
