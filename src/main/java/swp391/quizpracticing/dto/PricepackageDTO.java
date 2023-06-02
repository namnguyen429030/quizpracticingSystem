package swp391.quizpracticing.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PricepackageDTO {
    private Integer id;
    private String name;
    private Integer accessDuration;
    private Boolean status;
    private Float listPrice;
    private Float salePrice;
    private String description;
    private List<SubjectDTO> subjects;
    private List<UserSubjectDTO> userSubjects;
}
