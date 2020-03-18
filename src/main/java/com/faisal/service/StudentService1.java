package com.faisal.service;

import java.util.List;

import com.faisal.entity.StudentEntity;

public interface StudentService1 {

	public void savestudentobj(StudentEntity student);

	public List<StudentEntity> getAllStudents();

	public StudentEntity getStudenytObjById(Integer id);

	public void deleteStudentObj(StudentEntity stdentity);
	

}
