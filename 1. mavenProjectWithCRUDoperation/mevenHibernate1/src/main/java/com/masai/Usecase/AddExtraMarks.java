package com.masai.Usecase;

import java.util.Scanner;

import com.masai.model.dao.StudentDao;
import com.masai.model.dao.StudentDaoImp;

public class AddExtraMarks {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Student roll number: ");
        int roll= scanner.nextInt();
        
        System.out.println("Enter Bonus Marks: ");
        int bonusMarks= scanner.nextInt();
        
        StudentDao dao = new StudentDaoImp();

        dao.updateMarks(roll, bonusMarks);
	}
}
