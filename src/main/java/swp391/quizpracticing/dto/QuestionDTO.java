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
public class QuestionDTO {
    private Integer id;
    private AnswerDTO answer;
    private DimensionDTO dimension;
    private LevelDTO questionLevelId;
    private Integer content;
    private String answerOptions;
    private Boolean status;
    private String image;
    private String audio;
    private String video;
    private List<LessonDTO> lessons;
    private List<SubcategoryDTO> subCategories;
    private List<QuizreviewQuestionDTO> quizreviewQuestions;
}
