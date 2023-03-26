package com.ilare.spring.spring_boot.spring_course_spring_boot.dao;

import com.ilare.spring.spring_boot.spring_course_spring_boot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
