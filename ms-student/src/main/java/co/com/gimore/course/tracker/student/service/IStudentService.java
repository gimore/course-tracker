package co.com.gimore.course.tracker.student.service;

import co.com.gimore.course.tracker.student.entities.Student;

import java.util.List;

/**
 * Servicio de la entidad estudiante
 *
 * @author GIMORE
 * @version 1.0, 2024/02/10
 */
public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);

}
