package com.cognizant.ormlearn;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cognizant.ormlearn.model.Employee;
import com.cognizant.ormlearn.service.EmployeeService;

@SpringBootApplication
public class OrmLearnApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmLearnApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeService employeeService) {
        return args -> {
            List<Employee> permanentEmployees = employeeService.getAllPermanentEmployees();

            System.out.println("Permanent Employees: " + permanentEmployees);

            for (Employee employee : permanentEmployees) {
                System.out.println(employee.getName() + " Department: " + employee.getDepartment());
                System.out.println(employee.getName() + " Skills: " + employee.getSkillList());
            }

            System.out.println("Average Salary Department 1: " + employeeService.getAverageSalary(1));

            System.out.println("Native Query Employees: " + employeeService.getAllEmployeesNative());
        };
    }
}
