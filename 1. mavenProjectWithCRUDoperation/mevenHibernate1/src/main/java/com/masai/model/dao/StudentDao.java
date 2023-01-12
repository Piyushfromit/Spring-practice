package com.masai.model.dao;

import com.masai.model.Student;

public interface StudentDao {

	public boolean saveStudent(Student student);
	
	public boolean deleteStudent(int roll);
	
	public boolean updateStudent(Student NewStudent);
	
	public Student findStudentByRoll(int roll);
	
	public boolean updateMarks(int roll, int bonusMarks);
	
	
	
	
}
