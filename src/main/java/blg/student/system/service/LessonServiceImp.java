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
    public void deleteById(Long id) {
        lessonRepository.deleteById(id);
    }

    @Override
    public Lesson findById(Long id) {
        Lesson myLesson = lessonRepository.findById(id).get();
        return myLesson;
    }

    @Override
    public Lesson changeLessonInformationById(Long id,Lesson lesson) {
        Lesson myLesson = lessonRepository.findById(id).get();
        myLesson.setName(lesson.getName());
        lessonRepository.save(myLesson);
        return myLesson;
    }


}
