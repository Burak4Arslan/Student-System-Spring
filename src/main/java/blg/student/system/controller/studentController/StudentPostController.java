package blg.student.system.controller.studentController;

import blg.student.system.entity.Student;
import blg.student.system.service.StudentService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class StudentPostController {

    private final StudentService studentService;

    public StudentPostController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public Student postStudent(@RequestBody final Student student){
        return studentService.save(student);
    }

}
