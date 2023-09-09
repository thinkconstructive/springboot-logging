package com.thinkconstructive.springbootlogging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class Employee
{
    private static final Logger logInfo = LoggerFactory.getLogger(Employee.class);

    @GetMapping(value = "/{empId}")
    public String getEmployee(@PathVariable String empId)
    {
        logInfo.info("Employee Info Logging is enabled");
        logInfo.debug("Employee Debug Logging is enabled");
        return "Employee Exists";
    }
}
