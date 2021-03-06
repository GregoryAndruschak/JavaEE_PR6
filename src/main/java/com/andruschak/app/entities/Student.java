package com.andruschak.app.entities;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;

    @Column(name="pib",length = 150, nullable = false)
    private String name;

    private int course;

    @ManyToMany(cascade = {CascadeType.ALL})
    private List<Lecture> lectures;


    @ManyToMany(mappedBy="students")
    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    // Getters and settings
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", course=" + course + "]";
    }


}