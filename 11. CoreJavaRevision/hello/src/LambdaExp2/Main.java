package LambdaExp2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//  Short the student Using Lambda Expression 

public class Main {
	
	public static void main(String[] args) {
		
		List<Student > students = new ArrayList<>();
		
		students.add(new Student(10, "piyush", 500));
		students.add(new Student(12, "piyush", 450));
		students.add(new Student(8, "piyush",  600));
		students.add(new Student(14, "piyush", 550));
		
		Collections.sort(students , (s1, s2) -> s1.getMarks() > s2.getMarks()? +1 : -1);
		
		
		System.out.println(students);
		
		System.out.println("***********************************");
		
		for (Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("***********************************");
		
		students.forEach(s -> System.out.println(s));
		
		
	}

}
