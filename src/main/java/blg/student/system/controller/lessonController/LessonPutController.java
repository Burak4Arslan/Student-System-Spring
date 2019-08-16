package blg.student.system.controller.lessonController;

import blg.student.system.entity.Lesson;
import blg.student.system.service.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class LessonPutController {

    private final LessonService lessonService;

    public LessonPutController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @PutMapping("/lesson/{id}")
    public Lesson updateLesson(@PathVariable Long id,@RequestBody Lesson lesson){
        return lessonService.changeLessonInformationById(id,lesson);
    }

}
