package swp391.quizpracticing.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "settings")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Settings {
    @Id
    @Column(name = "id")
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Role role;

   @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "systemsetting_id",referencedColumnName = "id")
    private Systemsettings systemSetting;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "blogcategory_id",referencedColumnName = "id")
    private Blogcategory blogcategory;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "testtype_id",referencedColumnName = "id")
    private Testtype testType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "level_id",referencedColumnName = "id")
    private Level level;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lessontype_id",referencedColumnName = "id")
    private Lessontype lessonType;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dimension_id",referencedColumnName = "id")
    private Dimension dimension;
}
