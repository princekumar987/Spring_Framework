package com.repository;


import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.pojo.Student;
import com.rowmapper.RowMapperImpl;

public class Crud {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
    
	public void insert(int id,String name) {
		
		String sql="insert into student(eid,ename) values(?,?)";
		int row=jdbcTemplate.update(sql,id,name);
		System.out.println(row);
	}
	
    public void update(int id,String name) {
		
		String sql="update student set ename=? where eid=?";
		int row=jdbcTemplate.update(sql,name,id);
		System.out.println(row);
	}
    
    
     public void delete(int id) {
		
		String sql="delete from student where eid=?";
		int row=jdbcTemplate.update(sql,id);
		System.out.println(row);
	}
     
     
     public void readAlldeafult() {
 		
 		String sql="select * from student";
 		List<Map<String,Object>>list=jdbcTemplate.queryForList(sql);
 		
 		for(Map<String,Object>mp:list) {
 			  
 			for(Entry<String, Object> e:mp.entrySet()) {
 				System.out.println(e.getKey()+" "+e.getValue());
 			}
 		}
 		
 	}
     
     
     public void readAllPojo() {
  		
  		String sql="select * from student";
  		List<Student>list=jdbcTemplate.query(sql, new RowMapperImpl());
  		
  		System.out.println(list);
  		
  	}
     
     
     public void readSingle(int id) {
   		
   		String sql="select * from student where eid=?";
   		Student std=jdbcTemplate.queryForObject(sql,new RowMapperImpl(), id);
   		
   		System.out.println(std);
   		
   	}
}
