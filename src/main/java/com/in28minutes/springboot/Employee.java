package com.in28minutes.springboot;

import org.springframework.scheduling.config.Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    //Some other code

    @ManyToMany
    private List<Task> tasks;
}
