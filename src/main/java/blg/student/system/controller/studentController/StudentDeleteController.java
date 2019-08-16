package blg.student.system.controller.studentController;

import blg.student.system.entity.Student;
import blg.student.system.service.StudentService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class StudentDeleteController {

    private final StudentService studentService;

    public StudentDeleteController(StudentService studentService) {
        this.studentService = studentService;
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteById(id);
    }

}
