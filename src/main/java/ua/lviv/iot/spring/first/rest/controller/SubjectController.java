package ua.lviv.iot.spring.first.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.first.business.SubjectsService;
import ua.lviv.iot.spring.first.rest.model.Subjects;

@RequestMapping("/subjects")
@RestController
public class SubjectController {
    @Autowired
    private SubjectsService subjectsService;

    @GetMapping
    public List<Subjects> getSubjects() {
        return subjectsService.findAll();
    }
}
