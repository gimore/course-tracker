package co.com.gimore.course.tracker.course.persistence.crud;

import co.com.gimore.course.tracker.course.persistence.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de cursos.
 *
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@Repository
public interface ICourseRepository extends CrudRepository<Course, Long> {

}
