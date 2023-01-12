package com.masai.Usecase;

import java.util.Scanner;

import com.masai.model.Student;
import com.masai.model.dao.StudentDao;
import com.masai.model.dao.StudentDaoImp;

public class UpdateStudent {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

	    System.out.println("Enter Student Roll to update the Student : " );
	    int roll = sc.nextInt();
	    
	    System.out.println("Enter Student new Name : " );
	    String name = sc.next();
	    
	    System.out.println("Enter Student new marks : " );
	    int marks = sc.nextInt();
	    
	    
	    
	    Student st = new Student(roll, name, marks);

	    StudentDao dao = new StudentDaoImp();

	    dao.updateStudent(st);
	    
	    
	}

}
