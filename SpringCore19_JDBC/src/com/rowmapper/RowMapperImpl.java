package com.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.pojo.Student;

public class RowMapperImpl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowCount) throws SQLException {
		
		
		Student student=new Student();
		student.setEid(rs.getInt("eid"));
		student.setEname(rs.getString("ename"));
		
		return student;
	}

}
