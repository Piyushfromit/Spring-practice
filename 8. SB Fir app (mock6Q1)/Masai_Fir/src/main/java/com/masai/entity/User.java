package com.masai.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
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
	private Integer id;
	 
	@NotNull
	@Pattern(regexp = "A-Za-z")
	private String firstName ;
	@NotNull
	@Pattern(regexp = "A-Za-z")
	private String lastName ;
	
	@Size(min=10,message = "moblie number must be 10 digits ")
	@Column(unique = true)
	@Pattern(regexp = "[6789]{1}[0-9]{9}", message = "should be in required form")
	private String mobileNumber ;
	private String address;
	@Min(value = 9,message = "age should be greater than 8 ")
	private Integer age;
	
	
	private Gender gender;
	@Size(min = 6, max = 12)
	@NotNull(message="Password Must Need")
	@Pattern(regexp = "[A-Za-z0-9!@#$%^&*]", message = "Password must be have letter A-Z,a-z and charecter line @,%,&,Only Allow")
	private String password ;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Fir>firs=new ArrayList<>();
	 
	

}
