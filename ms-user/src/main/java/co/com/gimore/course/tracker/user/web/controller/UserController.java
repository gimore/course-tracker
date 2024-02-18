package co.com.gimore.course.tracker.user.web.controller;

import co.com.gimore.course.tracker.user.persistence.entity.User;
import co.com.gimore.course.tracker.user.domain.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador de la entidad usuario
 *
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private final IUserService userService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody User user) {
        userService.save(user);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllStudent() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping("/search-by-name/{name}")
    public ResponseEntity<?> findByIdCourse(@PathVariable String name) {
        return ResponseEntity.ok(userService.findByNameUser(name));
    }

}
