package com.springboot.dao;

import com.springboot.ex.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
    public Employee getEmployeeDetailsFromDatabase(long employeeId) {
        Employee employee1 = new Employee();
        //got data from database
        employee1.setEmployeeId(employeeId);
        employee1.setName("Athulitha Sai");
        employee1.setSalary(1200000.00);
        return employee1;
    }
}
