package ua.lviv.iot.spring.first.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.spring.first.rest.model.Subjects;

@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {

}