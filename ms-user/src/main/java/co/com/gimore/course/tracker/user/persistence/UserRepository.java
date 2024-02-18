package co.com.gimore.course.tracker.user.persistence;

import co.com.gimore.course.tracker.user.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio de la entidad usuario
 *
 * @author GIMORE
 * @version 1.0, 2024/02/10
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

 @Query("SELECT s FROM User s WHERE s.name = :name")
 List<User> findAllStudent(String name);

}
