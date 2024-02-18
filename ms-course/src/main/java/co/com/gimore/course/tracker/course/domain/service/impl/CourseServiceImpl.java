package co.com.gimore.course.tracker.course.domain.service.impl;

import co.com.gimore.course.tracker.course.domain.service.ICourseService;
import co.com.gimore.course.tracker.course.web.client.StudentClient;
import co.com.gimore.course.tracker.course.domain.dto.StudentDto;
import co.com.gimore.course.tracker.course.persistence.entity.Course;
import co.com.gimore.course.tracker.course.web.http.response.StudentByCourseResponse;
import co.com.gimore.course.tracker.course.persistence.crud.ICourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio para las operaciones de los cursos
 *
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private final ICourseRepository courseRepository;
    private final StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findNotesByIdCourse(Long idCourse) {
//        Course course = courseRepository.findById(idCourse).orElse(new Course());
//        List<StudentDto> studentDtoList = studentClient.findAllStudentByCourse(idCourse);
//        return StudentByCourseResponse.builder()
//                .courseName(course.getName())
//                .teacher(course.getTeacher())
//                .studentDtoList(studentDtoList)
//                .build();
        return null;
    }

}
