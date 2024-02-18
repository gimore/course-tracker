package co.com.gimore.course.tracker.course.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

    private Long id;
    private String name;
    private String lastName;
    private String email;
    private Long courseId;
}
