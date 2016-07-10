package ru.date.world.spring.model.users;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @SequenceGenerator(name = "user_id_seq",
            sequenceName = "user_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_id_seq")
    @Column(name = "id", updatable = false)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "user_name", nullable = false)
    private String userName;

    @Size(min = 5, max = 80)
    @Column(name = "email", nullable = false)
    private String email;

    @NotNull
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "reg_time", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private LocalDate regTime;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "last_login_time")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private LocalDate lastLoginTime;

    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "prelast_login_time")
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
    private LocalDate preLastLoginTime;

    @Column(name = "language_id")
    private int language_id;

}
