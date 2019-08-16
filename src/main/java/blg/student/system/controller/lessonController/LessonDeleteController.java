package blg.student.system.controller.lessonController;

import blg.student.system.entity.Lesson;
import blg.student.system.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class LessonDeleteController {

    private final LessonService lessonService;

    public LessonDeleteController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @DeleteMapping("/lesson/{id}")
    public void deleteLesson(@PathVariable Long id){
        lessonService.deleteById(id);
    }
}
