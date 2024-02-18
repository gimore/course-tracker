package co.com.gimore.course.tracker.course.web.client;

import co.com.gimore.course.tracker.course.domain.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Cliente para el consumo del servicio de estudiante
 *
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@FeignClient(name = "ms-user", url = "http://localhost:8080/api/student")
public interface StudentClient {

    @GetMapping("/search-my-course/{idCourse}")
    List<StudentDto> findAllStudentByCourse(@PathVariable Long idCourse);

}
