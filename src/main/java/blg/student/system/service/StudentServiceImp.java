package blg.student.system.service;

import blg.student.system.model.Lesson;
import blg.student.system.model.Student;
import blg.student.system.repository.LessonRepository;
import blg.student.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;
    private LessonRepository lessonRepository;

    @Autowired
    public StudentServiceImp(StudentRepository studentRepository, LessonRepository lessonRepository) {
        this.studentRepository = studentRepository;
        this.lessonRepository = lessonRepository;
    }

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

    @Override
    public Student changeStudentInformationById(Long id, Student student) {

        Student myStudent = studentRepository.findById(id).get();
        myStudent.setName(student.getName());
        myStudent.setSurname(student.getSurname());
        myStudent.setLessons(student.getLessons());
        studentRepository.save(myStudent);
        return myStudent;
    }

    @Override
    public Student putLessonToStudent(Long sid, Long lid) {

        Student student = studentRepository.findById(sid).get();
        Lesson lesson = lessonRepository.findById(lid).get();

        student.getLessons().add(lesson);
        studentRepository.save(student);
        return student;
    }
}
