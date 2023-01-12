package com.ecommerce.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotBlank(message = "{address.type.invalid}")
	@NotNull(message = "{address.type.invalid}")
	private String name;
	
	@NotBlank(message = "{address.type.invalid}")
	@NotNull(message = "{address.type.invalid}")
	private String phoneNo;
	
	private Date dateOfBirth;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Email email;

	
	
}
