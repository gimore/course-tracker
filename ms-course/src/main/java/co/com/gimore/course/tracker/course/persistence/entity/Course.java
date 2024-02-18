package co.com.gimore.course.tracker.course.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Entidad que representa un curso.
 *
 * @author GIMORE
 * @version 1.0, 2024/02/11
 */
@Entity
@Table(name = "course")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Long idCourse;
    @Column(name = "id_platform")
    private Long idPlatform;
    private String name;
    private String description;
    private String teacher;
    private String schedule;
    private String modality;

}
