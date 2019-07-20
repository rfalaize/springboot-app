package com.rhome.students.dao;

import com.rhome.students.model.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {

    private Map<Integer, Student> students;

    public StudentDao(){
        this.students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "Alex", "Computer Science"));
                put(2, new Student(2, "Jean", "Physics"));
                put(3, new Student(3, "Raf", "Maths"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }
}

