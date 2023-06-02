package swp391.quizpracticing.dto;


import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSubjectDTO {
    private UserDTO userId;
    private SubjectDTO subjectId;
    private PricepackageDTO pricePackageId;
    private Timestamp registrationTime;
    private RegistrationstatusDTO registrationStatusId;
    private Timestamp validFrom;
}
