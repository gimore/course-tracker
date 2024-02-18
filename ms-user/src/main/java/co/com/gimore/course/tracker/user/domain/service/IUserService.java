package co.com.gimore.course.tracker.user.domain.service;

import co.com.gimore.course.tracker.user.persistence.entity.User;

import java.util.List;

/**
 * Servicio de la entidad usuario
 *
 * @author GIMORE
 * @version 1.0, 2024/02/10
 */
public interface IUserService {

    List<User> findAll();

    User findById(Long id);

    void save(User user);

    List<User> findByNameUser(String name);

}
