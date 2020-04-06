package ua.lviv.iot.spring.first.rest.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;
    private String name;
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "student_subjects", joinColumns = {
            @JoinColumn(name = "subject_id", nullable = false) }, inverseJoinColumns = {
                    @JoinColumn(name = "student_id", nullable = false) })
    @JsonIgnoreProperties("subjects")
    private Set<Student> students;

    public Subjects() {
    }

    public Subjects(Integer id, String name) {
        Id = id;
        this.name = name;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

}
