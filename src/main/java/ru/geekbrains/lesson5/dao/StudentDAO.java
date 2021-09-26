package ru.geekbrains.lesson5.dao;

import ru.geekbrains.lesson5.entity.Student;

import java.util.List;
import java.util.UUID;


public interface StudentDAO {

    void update(Student student);

    void save(Student student);

    void add(Student student);

    void delete(Student student);

    Student getStudent(UUID uuid);

    List<Student> getStudents();

    void close();
}