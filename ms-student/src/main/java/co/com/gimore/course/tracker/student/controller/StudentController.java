package co.com.gimore.course.tracker.student.controller;

import co.com.gimore.course.tracker.student.entities.Student;
import co.com.gimore.course.tracker.student.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador de la entidad estudiante
 *
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final IStudentService studentService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @GetMapping("/search-my-course/{idCourse}")
    public ResponseEntity<?> findByIdCourse(@PathVariable Long idCourse) {
        return ResponseEntity.ok(studentService.findByIdCourse(idCourse));
    }

}
