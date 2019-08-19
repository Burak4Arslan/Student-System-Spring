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

    @PutMapping("/students")
    public Student putLessonToStudent(@RequestParam String studentNumber,@RequestParam String lessonCode){
        return studentService.putLessonToStudent(studentNumber,lessonCode);
    }
}
