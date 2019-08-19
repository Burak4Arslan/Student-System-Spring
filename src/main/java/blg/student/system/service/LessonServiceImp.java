package blg.student.system.service;

import blg.student.system.entity.Lesson;
import blg.student.system.repository.LessonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImp implements LessonService{

    private final LessonRepository lessonRepository;

    public LessonServiceImp(LessonRepository lessonRepository) {
        this.lessonRepository = lessonRepository;
    }

    @Override
    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

    @Override
    public Lesson save(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    @Override
    public void deleteByLessonCode(String lessonCode) {
        lessonRepository.deleteByLessonCode(lessonCode);
    }

    @Override
    public Lesson findByLessonCode(String lessonCode) {
        return lessonRepository.findByLessonCode(lessonCode);
    }

    @Override
    public Lesson changeLessonInformationById(Long id, Lesson lesson) {
        Lesson myLesson = lessonRepository.findById(id).get();
        myLesson.setName(lesson.getName());
        lessonRepository.save(myLesson);
        return myLesson;
    }


}
