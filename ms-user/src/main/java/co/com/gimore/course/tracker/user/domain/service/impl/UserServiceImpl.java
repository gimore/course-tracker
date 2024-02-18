package co.com.gimore.course.tracker.user.domain.service.impl;

import co.com.gimore.course.tracker.user.domain.service.IUserService;
import co.com.gimore.course.tracker.user.persistence.entity.User;
import co.com.gimore.course.tracker.user.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio de la entidad usuario
 *
 * @author GIMORE
 * @version 1.0, 2024/02/10
 */

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public List<User> findByNameUser(String name) {
        return userRepository.findAllStudent(name);
    }

}
