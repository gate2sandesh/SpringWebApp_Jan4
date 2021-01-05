package com.JSONPractice;

import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


@RestController
public class JsonController {
    public static void main(String[] args) {

    }




//    @RequestMapping(value = "/select")
//    public ResponseEntity<String> selectFromStudent(@RequestParam("email") String studentEmail) throws SQLException {
//
//        String selectQuery = "select * from  Person where email = '" + studentEmail + "';";
//
//        List<Person> people = jdbcTemplate.query(selectQuery, new BeanPropertyRowMapper(Person.class));
//
//        if(people.size() != 0){
//            return ResponseEntity.ok("student is enrolled");
//
//
//        }else{
//            return ResponseEntity.ok("student is not enrolled");
//        }
//
//    }
}
