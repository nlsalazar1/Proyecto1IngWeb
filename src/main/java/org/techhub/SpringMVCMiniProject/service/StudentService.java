package org.techhub.SpringMVCMiniProject.service;

import java.util.List;

import org.techhub.SpringMVCMiniProject.model.Student;

public interface StudentService {

	public boolean isAddStudent(Student model);
	public List<Student> getAllStudents();
	public boolean isDeleteById(int userid);
}
