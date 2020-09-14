package com.springboot.ex;

import java.util.concurrent.atomic.AtomicLong;

import com.springboot.dao.EmployeeDao;
import com.springboot.service.EmployeeService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private EmployeeService service;

    @Autowired
    private EmployeeDao dao1;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @GetMapping("/employeedetails/{id}")
    public Employee getEmployeeDetails(@PathVariable("id") long employeeId) {
        Employee e = service.getEmployeeDetails(employeeId);
        return e;
    }

    @PostMapping("/employeedetails")
    public Employee getEmployeeDetails(Employee emp) {
        return emp;
    }
}