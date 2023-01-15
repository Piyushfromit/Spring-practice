package com.masaimail.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mail {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mailing_id;
	private String subject;
	private String decription;
	private Boolean starrred=false;
	
	@ManyToOne(cascade = CascadeType.ALL)      //   from this can get many mail of one user
	private User sender;
	
	@OneToMany(cascade = CascadeType.ALL)      //   one mail we can send to many user
	private List<User> recievers = new ArrayList<>();
	
	

}
