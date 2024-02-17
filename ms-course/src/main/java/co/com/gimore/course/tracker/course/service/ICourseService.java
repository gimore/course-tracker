package co.com.gimore.course.tracker.course.service;

import co.com.gimore.course.tracker.course.entities.Course;
import co.com.gimore.course.tracker.course.http.response.StudentByCourseResponse;

import java.util.List;

/**
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);

}
