package tn.esprit.atelier.domaine;
import jakarta.persistence.*;
import lombok.*;

import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private LocalDate dateInscription;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String numPermis;
}
