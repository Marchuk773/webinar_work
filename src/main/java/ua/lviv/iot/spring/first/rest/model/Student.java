package ua.lviv.iot.spring.first.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    private String firstName;
    private String lastName;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Student(String firstName, String lastName, Integer id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Student(String firstName, String lastName) {
        this(firstName, lastName, null);
    }

    public Student() {
        this(null, null);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}