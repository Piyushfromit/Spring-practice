package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.DTO.StudentDTO;
import com.masai.exception.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentDao;



@Service
public class StudentServiceImpl implements StudentService {    //Service Layer
     
	@Autowired
	private StudentDao sdao;                           // Data axis layer 
	
	// register Student
	@Override 
	public Student registerStudent(Student student) {
		
		Student savedStudent = sdao.save(student);
		
		return savedStudent;
	}

     // get student by id
	@Override
	public Student getStudentByRoll(Integer roll) throws StudentException {
	
//		Optional<Student> opt = sdao.findById(roll);
//		
//		if(opt.isPresent()) {
//			Student student = opt.get();
//		    return student; 	
//		}else
//			throw new StudentException("Student Does not exist with roll: "+ roll);
		
		
		return sdao.findById(roll).orElseThrow(()-> new StudentException("Student Does not exist with roll: "+ roll));
		
	}

    // get all student
	@Override
	public List<Student> getAllStudentDetails() throws StudentException {
		
		List <Student> students = sdao.findAll();
		
		if(students.size()==0) {
			throw new StudentException("No Student Found Exception..");
		}else {
			return students;
		}
		
	}
	
	
	 // Delete student by id
	@Override
	public Student deleteStudentByRoll(Integer roll) throws StudentException {
		
		Optional<Student> opt = sdao.findById(roll);
		
		if(opt.isPresent()) {
			Student student = opt.get();
			
			sdao.delete(student);
			
		    return student; 	
		}else
			throw new StudentException("Student Does not exist with roll: "+ roll);
		
		
	}

	
	// Update student 
	@Override
	public Student updateStudentDetails(Student student) throws StudentException {

		Optional<Student> opt = sdao.findById(student.getRoll());
		
		if(opt.isPresent()) {
			// this save method will perform 2 operation 1. insert, 2. merge
			Student updateStudent = sdao.save(student);
			
			return updateStudent; 	
		}else
			throw new StudentException("invalid Student Details");
	}
	

	// Update student marks by roll
	@Override
	public Student updateStudentMarksByRoll(Integer roll, Integer gMarks) throws StudentException {
		
		Student existingStudent= sdao.findById(roll).orElseThrow(()-> new StudentException("Student Does not exist with roll: "+ roll));
		
		existingStudent.setMarks(existingStudent.getMarks()+gMarks);
		
		return sdao.save(existingStudent);
		
	}

	
	// get students by Address
	@Override
	public List<Student> getStudentsByAddress(String address) throws StudentException {
		
		List <Student> students = sdao.findByAddress(address);
		
		if(students.isEmpty()) {
			throw new StudentException("No Student Found With address: "+ address);
		}
		
		return students;
	}

	
	
	// get students by Marks
	@Override
	public List<Student> getStudentsByMarks(Integer marks) throws StudentException {
		
		List <Student> students= sdao.findByMarks(marks);
		
		if(students.isEmpty()) {
			throw new StudentException("No Student Found With address: "+ marks);
		}
		
		return students;
		
	}

	
	// Get student name by roll
	@Override
	public String getStudentNameByRoll(Integer roll) throws StudentException {
		
		String name = sdao.getStudentNameByRoll(roll);
		
		if(name != null) {
			return name;
		}else {
			throw new StudentException("Student not Found With Roll: "+ roll);
		}
		
	}

	
	// get student name and marks by address
	@Override
	public List<String> getStudentNameAndMarksByAddress(String address) throws StudentException {
		
		List<String> results = sdao.getStudentNameandmarksByAddress(address);
		
		if(results.isEmpty()) {
			throw new StudentException("Student not Found With Roll: "+ address);
		}else {
			return results;
		}
		
		
	}

	// get student name and marks by address using StudentDTO class (data transfer object class)
	@Override
	public List<StudentDTO> getStudentNameAndMarksByAddress2(String address) throws StudentException {

		List<StudentDTO> dtos = sdao.getStudentNameandmarksByAddress2(address);
		
		if(dtos.isEmpty()) {
			throw new StudentException("Student not Found With Roll: "+ address);
		}else
			return dtos;
	}

	
	







	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
