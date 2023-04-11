package org.techhub.SpringMVCMiniProject.repository;

import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.techhub.SpringMVCMiniProject.model.Student;

@Repository("studentRepo")
public class StudentRepositoryImpl implements StudentRepository {
	
	@Autowired
	JdbcTemplate template;
	
	List <Student>list;
	@Override
	public boolean isAddStudent(final Student model) {
		// TODO Auto-generated method stub
		int val = template.update("insert into mvcr values('0',?,?,?)",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, model.getName());
				ps.setString(2, model.getEmail());
				ps.setString(3, model.getContact());
			}			
			
		});
		if(val>0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		list = template.query("select * from mvcr", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Student s = new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setEmail(rs.getString(3));
				s.setContact(rs.getString(4));
				return s;
			}
			
		});
		return list;
	}

	@Override
	public boolean isDeleteById(final int userid) {
		// TODO Auto-generated method stub
		int val = template.update("delete from mvcr where id=?",new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1,userid);
			}
			
		});
		if(val>0)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	
}
