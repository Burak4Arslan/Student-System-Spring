package blg.student.system.service;

import blg.student.system.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> findAll();
    public Student save(Student student);
    public void deleteByStudentNumber(String studentNumber);
    public Student findByStudentNumber(String studentNumber);
    public Student changeStudentInformationById(Long id,Student student);
    public Student putLessonToStudent(String studentNumber,String lessonCode);
}
