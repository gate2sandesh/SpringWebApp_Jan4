package com.insertData;


import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

@RestController

public class DataBaseController {
    JdbcTemplate jdbcTemplate = null;

    public DataBaseController() throws SQLException {
        SimpleDriverDataSource simpleDriverDataSource = dataSource();
        jdbcTemplate = new JdbcTemplate(simpleDriverDataSource);

    }


    @RequestMapping(value = "/sandy")
    public ResponseEntity<String> insertRecordInStudent(@RequestParam("ID") String ID, @RequestParam("Name") String Name,
                                                        @RequestParam("Department") String Department) throws SQLException {

        String insertQuery = "insert into newinfo VALUES(?,?,?)";

        jdbcTemplate.update(insertQuery, ID, Name, Department);
        return ResponseEntity.ok(insertQuery);
    }


    public SimpleDriverDataSource dataSource() throws SQLException {
        SimpleDriverDataSource ds = new SimpleDriverDataSource();
        ds.setDriver(new com.mysql.cj.jdbc.Driver());
        ds.setUrl("jdbc:mysql://localhost:3306/jdbc");
        ds.setUsername("root");
        ds.setPassword("Welcome@123");
        return ds;
    }

}
