package org.techhub.SpringMVCMiniProject.repository;

import java.util.List;

import org.techhub.SpringMVCMiniProject.model.Student;

public interface StudentRepository {

	public boolean isAddStudent(Student model);
	public List<Student> getAllStudents();
	public boolean isDeleteById(int userid);
}
