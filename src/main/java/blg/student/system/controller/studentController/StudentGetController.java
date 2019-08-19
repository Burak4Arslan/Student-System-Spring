package blg.student.system.controller.studentController;

import blg.student.system.entity.Student;
import blg.student.system.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class StudentGetController {

    private final StudentService studentService;

    public StudentGetController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.findAll();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String studentNumber){
        return studentService.findByStudentNumber(studentNumber);
    }

}
