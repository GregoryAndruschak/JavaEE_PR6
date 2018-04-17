package com.andruschak.app.workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.andruschak.app.dao.StudentsDao;
import com.andruschak.app.entities.Student;

public class StudentsWorker {
    @Autowired
    StudentsDao studentsDao;

    public Student addStudent(Student student) {
        student = studentsDao.addStudent(student);
        System.out.println(student);
        return student;
    }

    public Student getLectre(int id) {
        Student s = studentsDao.getStudent(id);
        System.out.println(s);
        return s;
    }

    public void saveLecture(Student student) {
        System.out.println(student);
        studentsDao.saveStudent(student);
    }
}