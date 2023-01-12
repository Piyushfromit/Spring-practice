package com.masai.Usecase;

import java.util.Scanner;

import com.masai.model.Student;
import com.masai.model.dao.StudentDao;
import com.masai.model.dao.StudentDaoImp;

public class SaveStudent {
	
    public static void main(String[] args) {
	
	   Scanner sc = new Scanner(System.in);

       System.out.println("Enter Student Name: " );
       String name = sc.next();

       System.out.println("Enter Student marks: " );
       int marks = sc.nextInt();

       Student st = new Student(name, marks);

       StudentDao dao = new StudentDaoImp();

       dao.saveStudent(st);
   }

}
