package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.DTO.StudentDTO;
import com.masai.model.Student;
import com.masai.service.StudentService;





@RestController
public class StudentController {
	
	@Autowired
	private StudentService sService;

	
	// register Student
	@PostMapping("/regstudent")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student){
		
		Student registerdStudent= sService.registerStudent(student);
		
		return new ResponseEntity<Student>(registerdStudent, HttpStatus.CREATED);
		
		
		//http://localhost:8088/regstudent
	}
	
	
	// get student by id
	@GetMapping("/getstudent/{roll}")
	public ResponseEntity<Student> getStudentByRollHandler(@PathVariable("roll") Integer roll){
		
		Student student = sService.getStudentByRoll(roll);
		
		return new ResponseEntity<Student>(student, HttpStatus.OK);
		
		//http://localhost:8088/getstudent/1
	}
	
	
	// get all student
	@GetMapping("/allstudents")
	public ResponseEntity<List<Student>> getAllStudentHandler(){
		
		List<Student> students = sService.getAllStudentDetails();
		
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
		
		//http://localhost:8088/allstudents
	}
	
	
	// Delete student by id
	@DeleteMapping("/deletestudent/{roll}")
	public ResponseEntity<Student> deleteStudentByRollHandler(@PathVariable("roll") Integer roll){
		
		Student delStudent = sService.deleteStudentByRoll(roll);
		
		return new ResponseEntity<Student>(delStudent, HttpStatus.OK);
		
		//http://localhost:8088/deletestudent/1
		
	}
	
	
	// Update student by id
	@PutMapping("/updatestudent")
	public ResponseEntity<Student> updateStudentDetails(@RequestBody Student student){
		
		Student updateStudent =sService.updateStudentDetails(student);
		
		return new ResponseEntity<Student>(updateStudent, HttpStatus.ACCEPTED);
		
		//http://localhost:8088/updatestudent
	}
	
	
	
	// Update student marks by roll
	@PutMapping("/updatestudent/{roll}")
	public ResponseEntity<Student> updateStudentMarksByRollHandler(@PathVariable("roll") Integer roll, @RequestParam("gMarks")Integer gMarks){
		
		Student updateStudent = sService.updateStudentMarksByRoll(roll, gMarks);
		
       return new ResponseEntity<Student>(updateStudent, HttpStatus.OK);
		
		//http://localhost:8088/updatestudent/1?gMarks=80
		
	}
	
	
	// Get students by Address
	@GetMapping("/getstudentbyaddress/{address}")
	public ResponseEntity<List<Student>> getStudentByAddressHandler(@PathVariable("address") String address){
			
		List<Student> students = sService.getStudentsByAddress(address);
		
		
	    return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
			
		//http://localhost:8088/getstudentbyaddress/ranchi
			
	}
	
	
	// Get students by marks
	@GetMapping("/getstudentsbymarks/{marks}")
	public ResponseEntity <List<Student>> getStudentByMarksHandler(@PathVariable("marks") Integer marks){
				
		List<Student> students = sService.getStudentsByMarks(marks);
			
			
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
				
	    //http://localhost:8088/getstudentsbymarks/600
				
	}
	
	
	
	// Get student name by roll
		@GetMapping("/getstudentnamebyroll/{roll}")
		public ResponseEntity <String> getStudentNmaeByRollHandler(@PathVariable("roll") Integer roll){
					
			String name = sService.getStudentNameByRoll(roll);
				
				
			return new ResponseEntity<String>(name, HttpStatus.OK);
					
		    //http://localhost:8088/getstudentnamebyroll/54
					
		}
	
	     
	// get student name and marks by address
	@GetMapping("/getstudentsnameandmarksbyaddress/{address}")
	public ResponseEntity <List<String>> getStudentNmaeAndMarksByAddressHandler(@PathVariable("address") String address){
					
		List<String> results = sService.getStudentNameAndMarksByAddress(address);
				
				
		return new ResponseEntity<List<String>>(results, HttpStatus.OK);
					
		//http://localhost:8088/getstudentsnameandmarksbyaddress/ranchi
					
	}
		
		
	// get student name and marks by address using StudentDTO class (data transfer object class)
		@GetMapping("/getNameMarksDTOByAddress/{address}")
		public ResponseEntity <List<StudentDTO>> getStudentNmaeAndMarksByAddressHandler2(@PathVariable("address") String address){
						
			List<StudentDTO> results = sService.getStudentNameAndMarksByAddress2(address);
					
					
			return new ResponseEntity<List<StudentDTO>>(results, HttpStatus.OK);
						
			//http://localhost:8088/getNameMarksDTOByAddress/ranchi
						
		}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
