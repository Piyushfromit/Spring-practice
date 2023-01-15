package com.masaimail.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;
	
	//@NotNull
	//@Pattern(regexp = "A-Za-z")
	private String firstname;
	
	
	
	 //@NotNull
	//@Pattern(regexp = "A-Za-z")
	private String lastname;
	
	
	
	//@Size(min=10,max=10,message = "moblie number must be of 10 digits ")
	//@Column(unique = true)
	//@Pattern(regexp = "[6789]{1}[0-9]{9}", message = "need proper number")
	private String mobileNumber;
	
	
	
	private LocalDate dateOfBirth;
	
	
	
	//@Size(min = 6, max = 12)
	//@NotNull(message="Password Must Need")
	//@Pattern(regexp = "[A-Za-z0-9!@#$%^&*]", message = "Password include A-Z,a-z @,%,&")
	private String password;
	
	

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "sender")
	private List<Mail> recievedMails = new ArrayList<>();    // we can get list of mail of user. 
	
	
	
	
}
