package blg.student.system.controller;

import blg.student.system.model.Lesson;
import blg.student.system.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LessonController {
    private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @GetMapping("/lessons")
    public List<Lesson> getAllLessons(){
        return lessonService.findAll();
    }

    @GetMapping("/lesson/{id}")
    public Lesson getLesson(@PathVariable Long id){
        return lessonService.findById(id);
    }

    @PostMapping("/lesson")
    public Lesson postLesson(@RequestBody final Lesson lesson){
        return lessonService.save(lesson);
    }

    @PutMapping("/lesson/{id}")
    public Lesson updateLesson(@PathVariable Long id,@RequestBody Lesson lesson){
        return lessonService.changeLessonInformationById(id,lesson);
    }

    @DeleteMapping("/lesson/{id}")
    public void deleteLesson(@PathVariable Long id){
        lessonService.deleteById(id);
    }
}
