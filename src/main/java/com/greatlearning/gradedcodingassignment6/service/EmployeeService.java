package com.greatlearning.gradedcodingassignment6.service;



import java.util.List;
import com.greatlearning.gradedcodingassignment6.entity.Employee;
import com.greatlearning.gradedcodingassignment6.entity.Role;
import com.greatlearning.gradedcodingassignment6.entity.User;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	public List<Employee> searchByFirstName(String firstName);
	
	public List<Employee> sortByFirstName(String order);
	
	public User saveUser(User user);
	
	public Role saveRole(Role role);
	
	public Employee findEmployeeById(int theId);

}
