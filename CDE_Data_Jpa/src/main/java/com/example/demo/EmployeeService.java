package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	
	public void save(Employee emp) {
		
		empRepo.save(emp);
	}
	
	public void saveAll(List<Employee> empList) {
		
		empRepo.saveAll(empList);
	}
	
	public Employee findEmp(int id) {
		return empRepo.findById(id).get();
		
	}
	
	/*
	 * public Employee getByName(String name) {
	 * 
	 * return empRepo.lookByName(name); }
	 * 
	 * 
	 * public int getMaxSal() { return empRepo.findMaxSalary(); }
	 * 
	 * public List<Employee> getSortedEmp(){
	 * 
	 * return empRepo.findAll(Sort.by(Direction.DESC, "name")); }
	 * 
	 * 
	 * public List<Employee> getSortedEmpAsc(){
	 * 
	 * return empRepo.sortByNameAsc(); }
	 */
	
	public Employee getNameandSalary(String name,int salary) {
		
		return empRepo.findByNameAndSalary(name, salary);
	}
	
      public List<Employee> getNameorSalary(String name,int salary) {
		
		return empRepo.findByNameOrSalary(name, salary);
	}
	
      public List<Employee> findBySalaryBetweenn(int first,int second){
    	  
    	  return empRepo.findBySalaryBetween(first,second);
      }
      
      public List<Employee> findBySalaryGreaterThan(int salary){
    	  return empRepo.findBySalaryGreaterThan(salary);
      }
	
      
      public List<Employee> findBySalaryLessThan(int salary){
    	  return empRepo.findBySalaryLessThan(salary);
      }
      
      public List<Employee> findByNameIsNull(){
    	  return empRepo.findByNameIsNull();
      }
      
      public List<Employee> findByNameLike(String name){
    	  
    	  return empRepo.findByNameLike(name);
      }
      
      public List<Employee> findByNameIn(List<String> list){
    	 
    	  return empRepo.findByNameIn(list);
      }
}
