package com.masai.model;

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
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Mail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mailing_id;
	private String subject;
	private String decription;
	private Boolean starrred=false;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User sender;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<User> recievers = new ArrayList<>();
	
}
