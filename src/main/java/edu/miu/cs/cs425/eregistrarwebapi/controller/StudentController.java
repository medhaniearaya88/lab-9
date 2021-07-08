package edu.miu.cs.cs425.eregistrarwebapi.controller;

import edu.miu.cs.cs425.eregistrarwebapi.model.Student;
import edu.miu.cs.cs425.eregistrarwebapi.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/student")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }
    //    http://localhost/eregistrar/api/student/list - Displays JSON array of Students data.
    @GetMapping("/list")
    public List<Student> findStudents(){
        return studentService.findAllStudents();
    }
    //    http://localhost/eregistrar/api/student/register - Register a new Student into the system
    @PostMapping("/register")
    public Student registerStudent(Student student){
        return studentService.registerStudent(student);

    }

    //    http://localhost/eregistrar/api/student/get/1 - Read/display a Student data for student with ID, 1.
    @GetMapping("/get/{studentId}")
    public Student getStudent(@PathVariable Long studentId){
        return studentService.findStudentById(studentId);
    }
//    http://localhost/eregistrar/api/student/get/1 - Retrieves and Updates Student data for student with ID, 1.
//    http://localhost/eregistrar/api/student/delete/3 - Delete the student data for student with ID, 3.
    @GetMapping("/delete/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.deleteStudentById(studentId);
    }

}
