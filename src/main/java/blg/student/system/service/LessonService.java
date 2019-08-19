package blg.student.system.service;

import blg.student.system.entity.Lesson;

import java.util.List;

public interface LessonService {
    public List<Lesson> findAll();
    public Lesson save(Lesson lesson);
    public void deleteByLessonCode(String lessonCode);
    public Lesson findByLessonCode(String lessonCode);
    public Lesson changeLessonInformationById(Long id, Lesson lesson);
}
