package blg.student.system.service;

import blg.student.system.entity.Lesson;

import java.util.List;

public interface LessonService {
    public List<Lesson> findAll();
    public Lesson save(Lesson lesson);
    public void deleteById(Long id);
    public Lesson findById(Long id);
    public Lesson changeLessonInformationById(Long id,Lesson lesson);
}
