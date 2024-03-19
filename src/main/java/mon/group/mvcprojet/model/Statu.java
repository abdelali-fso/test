package mon.group.mvcprojet.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Statu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStatu;
    private String ouvre;
    private String ferme;
    private String enCours;
}
