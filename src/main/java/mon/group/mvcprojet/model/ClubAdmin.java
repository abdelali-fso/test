package mon.group.mvcprojet.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClubAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClubAdmin;

    private String fullName;
    private Integer age;
    private Double salary = 5000.0;

    @OneToMany(mappedBy = "admin", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Club> clubList;
}
