package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.DTO.StudentDTO;
import com.masai.exception.StudentException;
import com.masai.model.Student;


@Repository
public interface StudentDao extends JpaRepository<Student, Integer>{
	
	public List<Student> findByAddress(String address);	  // it is abstract method
	
	//public Optional<Student> findByMarks(int marks);
	
	public List<Student> findByMarks(Integer marks);
	
	
//	@Query("select s.name from Student s where s.roll=:r")           // named parameter         
//	public String getStudentNameByRoll(@Param("r") Integer roll);
	
	
	@Query("select s.name from Student s where s.roll=?1")           //positional placeholder
	public String getStudentNameByRoll(Integer roll);

	
	@Query("select s.name, s.marks from Student s where s.address=?1")
	public List<String> getStudentNameandmarksByAddress(String address) throws StudentException;
	
	@Query("select new com.masai.DTO.StudentDTO(s.name, s.marks) from Student s where s.address=?1")
	public List<StudentDTO> getStudentNameandmarksByAddress2(String address) throws StudentException;
	
	
	
	
	
}
 