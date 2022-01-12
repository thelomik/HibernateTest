package com.in28minutes.springboot;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    //Some other code

    @ManyToMany(mappedBy = "tasks")
    private List<Employee> employees;
}