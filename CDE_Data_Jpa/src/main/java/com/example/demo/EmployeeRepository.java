package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

	/*
	 * @Query("select e from Employee e where name=:name") public Employee
	 * lookByName(String name);
	 * 
	 * @Query("select max(e.salary) from Employee e") public int findMaxSalary();
	 * 
	 * @Query(value="select * from employee order by name",nativeQuery = true)
	 * public List<Employee> sortByNameAsc();
	 */
	
	public Employee  findByNameAndSalary(String name,int salary);
	
	public List<Employee> findByNameOrSalary(String name,int salary);
	
	public List<Employee> findBySalaryBetween(int first,int second);
	
	public List<Employee> findBySalaryGreaterThan(int salary);
	
	public List<Employee> findBySalaryLessThan(int salary);
	
	public List<Employee> findByNameIsNull();  // notNull also
	
	public List<Employee> findByNameLike(String name);  // NotLike
	
	public List<Employee> findByNameIn(List<String> list);  // NotIn
}
