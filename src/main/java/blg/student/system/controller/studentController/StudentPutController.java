package blg.student.system.controller.studentController;

import blg.student.system.entity.Student;
import blg.student.system.service.StudentService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class StudentPutController {

    private final StudentService studentService;

    public StudentPutController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PutMapping("/student/{id}")
    public Student putStudent(@PathVariable Long id,@RequestBody Student student){
        return studentService.changeStudentInformationById(id,student);
    }

    @PutMapping("/student/{sid}/lesson/{lid}")
    public Student putLessonToStudent(@PathVariable Long sid,@PathVariable Long lid){
        return studentService.putLessonToStudent(sid,lid);
    }

}
