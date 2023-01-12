package com.masai;



import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.masai")
@PropertySource("a1.properties")
public class AppConfigure {
	
	
	
	
	
	@Bean
	public Map <Person, Gym>theMap(){
		
		Map<Person, Gym>map=new LinkedHashMap();
		map.put(new Person(1, "piyush", "7903191138", "guptaji@gmail.com", 5), new Gym(1, "Royal", 5000));
		map.put(new Person(2, "bittu", "7277818543", "bittuji@gmail.com", 10), new Gym(11, "Spice", 6000));
		map.put(new Person(2, "ravi", "790319999", "piyush@gmail.com", 22), new Gym(101, "body", 4000));
		
		return map;
		
	}
	
	@Bean 
	public List<Person> theList(){
		
		List<Person> list= new ArrayList<Person>();
		list.add(new Person(1, "piyush", "7903191138", "guptaji@gmail.com", 5));
		list.add(new Person(2, "bittu", "7277818543", "bittuji@gmail.com", 10));
		list.add(new Person(3, "ravi", "7277818543", "guptaji@gmail.com", 90));
		list.add(new Person(2, "ravi", "790319999", "piyush@gmail.com", 22));
		list.add(new Person(5, "raj", "7903191138", "bittuji@gmail.com", 45));
		
		return list;
		
		
	}
	
	
	
	
	

}
