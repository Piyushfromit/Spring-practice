package com.masai.Usecase;


import java.util.Scanner;
import com.masai.model.dao.StudentDao;
import com.masai.model.dao.StudentDaoImp;


public class FindStudentByRoll {

	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Student roll number: ");

        int roll= scanner.nextInt();
        
        StudentDao dao = new StudentDaoImp();

        dao.findStudentByRoll(roll);
        
	}
}
