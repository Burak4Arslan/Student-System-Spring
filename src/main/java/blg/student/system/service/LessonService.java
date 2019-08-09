package blg.student.system.service;

import blg.student.system.model.Lesson;

import java.util.List;

public interface LessonService {
    public List<Lesson> findAll();
    public Lesson save(Lesson lesson);
    public void deleteById(Long id);
    public Lesson findById(Long id);
}
