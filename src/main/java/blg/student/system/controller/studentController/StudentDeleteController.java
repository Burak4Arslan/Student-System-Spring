package blg.student.system.controller.studentController;

import blg.student.system.entity.Student;
import blg.student.system.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@CrossOrigin(origins = "*")
@Transactional
@RestController
public class StudentDeleteController {

    private final StudentService studentService;

    public StudentDeleteController(StudentService studentService) {
        this.studentService = studentService;
    }

    @DeleteMapping("/students")
    public void deleteStudent(@RequestParam String studentNumber) {
        studentService.deleteByStudentNumber(studentNumber);
    }

}
