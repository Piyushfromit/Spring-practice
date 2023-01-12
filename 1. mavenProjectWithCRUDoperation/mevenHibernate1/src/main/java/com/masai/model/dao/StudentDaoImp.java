package com.masai.model.dao;

import javax.persistence.EntityManager;

import com.masai.model.Student;

import com.masai.utility.Utility;

public class StudentDaoImp implements StudentDao{

	@Override
	public boolean saveStudent(Student student) {
		
	   boolean flag = false;
		
	   EntityManager em = Utility.provideEntityManager();

       em.getTransaction().begin();
       em.persist(student);
       flag = true;
       em.getTransaction().commit();

       System.out.println("Student saved Successfully ");

       em.close();

       return flag;
	}
	
	
	
	

	@Override
	public boolean deleteStudent(int roll) {
		
		boolean flag = false;
		
	    EntityManager em = Utility.provideEntityManager();
	    
	    Student student =em.find(Student.class, roll);
	    
	    if(student != null) {
	    	
	    	em.getTransaction().begin();
	    	em.remove(student);
	    	flag = true;
	    	em.getTransaction().commit();
	    	System.out.println("Student Deleted Successfully ");
         }
	    em.close();

		return flag;
	}

	@Override
	public boolean updateStudent(Student newStudent) {
		
		boolean flag=false;
		
		EntityManager em= Utility.provideEntityManager();
		
		em.getTransaction().begin();
		
		Student oldStudent = em.find(Student.class, newStudent.getRoll());
		
		if(oldStudent!=null) {
			em.merge(newStudent);
			flag=true;
			em.getTransaction().commit();
			System.out.println("Student Updated Successfully ");
		}else {
			System.out.println("Student is not Present");
		}
		
		em.close();
		
		return flag;
	}

	@Override
	public Student findStudentByRoll(int roll) {
		
		Student student=null;
		
		EntityManager em= Utility.provideEntityManager();
		
		student = em.find(Student.class, roll);
		
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("Student is not Present with roll: "+roll);
		}
		
		
		return null;
	}


	@Override
	public boolean updateMarks(int roll, int bonusMarks) {
		
		boolean flag = false;

        EntityManager em= Utility.provideEntityManager();
		
		Student student = em.find(Student.class, roll);
		
		if(student != null) {
			
			em.getTransaction().begin();
			
            student.setMarks(student.getMarks()+ bonusMarks);;
            em.getTransaction().commit();
            
            System.out.println("Marks Updated Successfully");
            flag = true;
		}else {
			System.out.println("Student is not Present with roll: "+roll);
		}
		em.clear();
		
		return flag;
	}

}
