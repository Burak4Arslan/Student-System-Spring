package blg.student.system.controller;

import blg.student.system.model.Student;
import blg.student.system.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentService.findAll();
    }

    @PostMapping("/student")
    public Student postStudent(@RequestBody final Student student){
        return studentService.save(student);
    }
}
