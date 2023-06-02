package swp391.quizpracticing.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "registrationstatus")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Registrationstatus {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;
    
}
