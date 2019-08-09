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

    @PostMapping("/lesson")
    public Lesson postLesson(@RequestBody final Lesson lesson){
        return lessonService.save(lesson);
    }
}
