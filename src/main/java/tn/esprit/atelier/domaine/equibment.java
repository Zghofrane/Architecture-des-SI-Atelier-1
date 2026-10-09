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

public class equibment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquibment;
    private String libelle;
}
