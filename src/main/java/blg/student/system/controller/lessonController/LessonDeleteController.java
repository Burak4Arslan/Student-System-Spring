package blg.student.system.controller.lessonController;

import blg.student.system.service.LessonService;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@CrossOrigin(origins = "*")
@Transactional
@RestController
public class LessonDeleteController {

    private final LessonService lessonService;

    public LessonDeleteController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

    @DeleteMapping("/lessons")
    public void deleteLesson(@RequestParam String lessonCode){
        lessonService.deleteByLessonCode(lessonCode);
    }
}
