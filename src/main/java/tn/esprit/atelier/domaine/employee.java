package tn.esprit.atelier.domaine;
import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idEmployee;
    private String nom;
    private String prenom;
    @Enumerated(value = EnumType.STRING)
    private RoleEmployee role;



}
