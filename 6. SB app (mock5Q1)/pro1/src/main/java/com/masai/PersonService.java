package com.masai;

import java.util.Collections;
import java.util.*;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;



@Service
public class PersonService {
	
	
	@Autowired
	private Map <Person, Gym> theMap;

	
	@Autowired
	private  List<Person> theList;
	
	
	@Autowired
	@Value("${name}")
	private String appName;
	
	
	
	public void printMap(){
		
		Set<Person>set=theMap.keySet();
		
		for(Person s:set) {
			
			System.out.println(s+" "+theMap.get(s));
			
		}
	
	}
	
	

	public void printList(){
		
		Collections.sort(theList, (a1,a2) -> {
			if(a1.getAge()> a2.getAge()) {
				return 1;
			}else {
				return -1;
			}
			
		});
		
		
		theList.forEach((s)->{
			System.out.println(s);
		});

	
	}
	

	public void printAppName(){
		
		System.out.println(appName);
	
	}

}
