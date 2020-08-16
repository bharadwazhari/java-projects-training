package com.springboot.service;

import com.springboot.dao.EmployeeDao;
import com.springboot.ex.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDao dao;
    //EmployeeDao dao = new EmployeeDao();

    public Employee getEmployeeDetails(long employeeId) {
        Employee e =  dao.getEmployeeDetailsFromDatabase(employeeId);
        return e;
    }
}
