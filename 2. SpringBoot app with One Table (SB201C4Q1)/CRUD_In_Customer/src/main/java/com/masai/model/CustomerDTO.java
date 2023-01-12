package com.masai.model;

//import javax.persistence.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {
	
	
	private String customerName;
	private String address;
	private Integer age;
	
	
	

}
