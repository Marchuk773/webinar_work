package ua.lviv.iot.spring.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.rest.model.Student;

@RequestMapping("/students")
@RestController
public class StudentsController {

    @GetMapping(path = "/{id}")
    public Student getStudent(@PathVariable("id") Integer studentId) {
        System.out.println(studentId);
        return new Student("petro", "ivan", 12);
    }

    @PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE,
            "application/x-yaml" })
    public Student createStudent(@RequestBody Student student) {
        student.setId(2002);
        return student;
    }

}
