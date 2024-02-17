package co.com.gimore.course.tracker.student.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa la entidad estudiante
 *
 * @author GIMORE
 * @version 1.0, 2024/02/10
 */
@Data
@Entity
@Builder
@Table(name = "students")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    private String email;
    @Column(name = "course_id", nullable = false)
    private Long courseId;

}
