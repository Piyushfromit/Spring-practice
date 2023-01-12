package com.masai.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Fir {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer fir_id;
	
	
	private LocalDateTime firTime;

	
	@ManyToMany(cascade = CascadeType.ALL,mappedBy = "firs")
	private List<User> userList = new ArrayList<>();
	
	

	

}
