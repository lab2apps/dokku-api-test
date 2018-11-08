package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Value("${spring.datasource.url}")
    private String dbUrl;

    @GetMapping("/lol")
    public String lol(){
        return dbUrl;
    }

    @GetMapping("/kek")
    public String kek(){
//        return jdbcTemplate.queryForObject("SELECT service_name FROM event_processing_job_record LIMIT 1;", String.class);
        return "LOL";
    }
}
