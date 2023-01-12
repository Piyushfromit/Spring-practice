package com.masai.Usecase;

import java.util.Scanner;

import com.masai.model.dao.StudentDao;
import com.masai.model.dao.StudentDaoImp;

public class DeleteStudent {
	
   public static void main(String[] args) {
	   
	  Scanner sc = new Scanner(System.in);
	  
      System.out.println("To delete the student Enter Roll Number : ");
      int roll= sc.nextInt();

      StudentDao dao = new StudentDaoImp();

      dao.deleteStudent(roll);

   }
}
