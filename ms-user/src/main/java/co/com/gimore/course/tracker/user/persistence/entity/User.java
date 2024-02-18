package co.com.gimore.course.tracker.user.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Representa la entidad estudiante
 *
 * @author GIMORE
 * @version 1.0, 2024/02/10
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;
    private String name;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    private String email;
    @Column(name = "name_user", nullable = false)
    private String nameUser;
    private String password;

}
