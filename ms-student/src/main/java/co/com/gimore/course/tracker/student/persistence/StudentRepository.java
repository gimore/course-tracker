package co.com.gimore.course.tracker.student.persistence;

import co.com.gimore.course.tracker.student.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio de la entidad estudiante
 *
 * @author GIMORE
 * @version 1.0, 2024/02/10
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

 @Query("SELECT s FROM Student s WHERE s.courseId = :idCourse")
 List<Student> findAllStudent(Long idCourse);

}
