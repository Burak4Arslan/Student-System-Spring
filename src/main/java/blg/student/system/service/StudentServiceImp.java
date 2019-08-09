package blg.student.system.service;

import blg.student.system.model.Student;
import blg.student.system.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImp(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student findById(Long id) {
        Student myStudent = studentRepository.findById(id).get();
        /*System.out.println(myStudent.getId());
        System.out.println(myStudent.getName());
        System.out.println(myStudent.getSurname());
        System.out.println(myStudent.getLessons());*/
        return myStudent;
    }
}
