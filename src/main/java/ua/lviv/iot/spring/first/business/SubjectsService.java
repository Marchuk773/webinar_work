package ua.lviv.iot.spring.first.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.spring.first.dataaccess.SubjectsRepository;
import ua.lviv.iot.spring.first.rest.model.Subjects;

@Service
public class SubjectsService {
    @Autowired
    private SubjectsRepository subjectsRepository;

    public List<Subjects> findAll() {
        return subjectsRepository.findAll();
    }
}