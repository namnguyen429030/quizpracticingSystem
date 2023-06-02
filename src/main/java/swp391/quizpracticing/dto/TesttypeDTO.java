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
public class TesttypeDTO {
    private Integer id;
    private String name;
    private Boolean status;
    private SettingsDTO setting;
    private List<LessonDTO>lessons;
}
