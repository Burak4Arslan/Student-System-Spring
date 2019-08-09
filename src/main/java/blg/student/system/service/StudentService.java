package blg.student.system.service;

import blg.student.system.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> findAll();
    public Student save(Student student);
    public void deleteById(Long id);
    public Student findById(Long id);
}
