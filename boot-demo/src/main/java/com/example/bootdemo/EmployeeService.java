package com.example.bootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    public  void printEmail(){
        System.out.println("Fetching employees emails");
        jdbcTemplate.queryForList("select email from employee",String.class)
                .forEach(System.out::println);
    }

}
