package com.faisal.dao;

import java.util.List;

import com.faisal.entity.StudentEntity;

public interface StudentDao1 {

	public void savestudentobj(StudentEntity student);

	public List<StudentEntity> getAllStudents();

	public StudentEntity getStudentObjById(Integer id);

	public void deleteStudentObj(StudentEntity stdentity);

}
