package blg.student.system.controller.lessonController;

import blg.student.system.entity.Lesson;
import blg.student.system.service.LessonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class LessonGetController {

    private final LessonService lessonService;

    public LessonGetController(LessonService lessonService) {
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


}
