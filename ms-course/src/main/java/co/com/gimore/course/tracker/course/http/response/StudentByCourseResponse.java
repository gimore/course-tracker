package co.com.gimore.course.tracker.course.http.response;

import co.com.gimore.course.tracker.course.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Respuesta para la búsqueda de estudiantes por curso
 *
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

    private String courseName;
    private String teacher;
    private List<StudentDto> studentDtoList;

}
