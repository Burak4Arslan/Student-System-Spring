package blg.student.system.service;

import blg.student.system.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student save(Student student);
    public void deleteById(Long id);
    public Student findById(Long id);
    public Student changeStudentInformationById(Long id,Student student);
    public Student putLessonToStudent(Long sid,Long lid);
}
