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
public class CategoryDTO {
    private Integer id;
    private String name;
    private String description;
    private Boolean status;
    private SettingsDTO setting;
    private List<SubcategoryDTO> subCategories;
}
