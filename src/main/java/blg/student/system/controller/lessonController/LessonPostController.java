package blg.student.system.controller.lessonController;

import blg.student.system.entity.Lesson;
import blg.student.system.service.LessonService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
public class LessonPostController {

    private final LessonService lessonService;

    public LessonPostController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PostMapping("/lessons")
    public Lesson postLesson(@RequestBody final Lesson lesson){
        return lessonService.save(lesson);
    }


}
