package com.faisal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faisal.dao.StudentDao1;
import com.faisal.entity.StudentEntity;

@Service
public class StudentService1Imp implements StudentService1 {

	@Autowired
	private StudentDao1 studentdao;
	
	@Override
	@Transactional
	public void savestudentobj(StudentEntity student) {
		
		studentdao.savestudentobj(student);
	}

	@Override
	@Transactional
	public List<StudentEntity> getAllStudents() {
		
		return studentdao.getAllStudents();
	}

	@Override
	@Transactional
	public StudentEntity getStudenytObjById(Integer id) {
		
		return studentdao.getStudentObjById(id);
	}

	@Override
	@Transactional
	public void deleteStudentObj(StudentEntity stdentity) {
		
		 studentdao.deleteStudentObj(stdentity);
		 
		
	}

	
}
