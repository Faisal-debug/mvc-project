package com.faisal.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.faisal.entity.StudentEntity;

@Repository
public class StudentDaoImp implements StudentDao1 {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public void savestudentobj(StudentEntity student) {
		
		factory.getCurrentSession().saveOrUpdate(student);
		
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		return factory.getCurrentSession().createQuery("FROM StudentEntity").list();
	}

	@Override
	public StudentEntity getStudentObjById(Integer id) {
		
	StudentEntity studentEn=factory.getCurrentSession().get(StudentEntity.class, id);
		return studentEn;
	}

	@Override
	public void deleteStudentObj(StudentEntity stdentity) {
		
		factory.getCurrentSession().delete(stdentity);
		
		
	}

	
}
