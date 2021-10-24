package ir.maktab.BusTicket.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Inheritance
@Table(name = User.TABLE_NAME)
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity<Long>{

    public static final String TABLE_NAME = "user_table";
    private static final String FIRST_NAME = "first_name";
    private static final String LAST_NAME = "last_name";
    private static final String USER_NAME = "user_name";
    private static final String PASSWORD = "password";
    private static final String EMAIL = "email";
    private static final String NATIONAL_CODE = "national_code";
    private static final String BIRTHDAY = "birthday";
    private static final String GENDER = "gender";

    @Column(name = FIRST_NAME,nullable = false)
    @NotBlank(message = "firstname is mandatory!")
    private String firstName;

    @Column(name = LAST_NAME,nullable = false)
    @NotBlank(message = "lastname is mandatory!")
    private String lastName;

    @Column(name = USER_NAME,nullable = false)
    @NotBlank(message = "username is mandatory!")
    private String userName;

    @Column(name = PASSWORD,nullable = false)
    @NotBlank(message = "password is mandatory!")
    private String password;

    @Column(name = EMAIL,nullable = false)
    @NotBlank(message = "email is mandatory!")
    private String email;

    @Column(name = NATIONAL_CODE,nullable = false)
    @NotBlank(message = "national code is mandatory!")
    private long nationalCode;

    @Column(name = BIRTHDAY,nullable = false)
    @NotBlank(message = "birthday is mandatory!")
    private LocalDateTime birthday;

    @Column(name = GENDER,nullable = false)
    @NotBlank(message = "gender is mandatory!")
    private String gender;

}
