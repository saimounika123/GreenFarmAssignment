package com.greenfarm.DAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.greenfarm.domain.Student;

@Transactional
@Repository
public class StudentDAO {
	
	@Autowired
	public SessionFactory sessionFactory;

	public Boolean createStudent(Student stu) {
		Session session = this.sessionFactory.getCurrentSession();

		if (session.save(stu) == null)
			return false;
		else
			return true;
	}

	public List<Student> listStudent() {
		Session session = this.sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(Student.class);
		List<Student> list = criteria.list();
		return list;
	}

}
