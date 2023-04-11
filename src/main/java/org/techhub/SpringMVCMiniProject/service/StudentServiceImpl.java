package org.techhub.SpringMVCMiniProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.SpringMVCMiniProject.model.Student;
import org.techhub.SpringMVCMiniProject.repository.StudentRepository;

@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	@Override
	public boolean isAddStudent(Student model) {
		// TODO Auto-generated method stub
		boolean b = studentRepo.isAddStudent(model);
		return b;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.getAllStudents();
	}

	@Override
	public boolean isDeleteById(int userid) {
		// TODO Auto-generated method stub
		return studentRepo.isDeleteById(userid);
	}

	
}
