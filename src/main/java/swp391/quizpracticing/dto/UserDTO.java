package swp391.quizpracticing.dto;


import java.sql.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer id;
    private RoleDTO role;
    private String avatar;
    private String fullName;
    private String password;
    private String email;
    private Boolean gender;
    private String mobile;
    private String token;
    private Date lastUpdateDate;
    private Boolean enable;
    private List<BlogDTO>blogs;
    private SubjectDTO subject;
    private List<LessonDTO>lessons;
    private List<QuizreviewDTO>quizReviews;
    private List<UserSubjectDTO>userSubjects;
}
