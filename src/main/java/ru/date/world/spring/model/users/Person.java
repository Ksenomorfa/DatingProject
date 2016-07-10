package ru.date.world.spring.model.users;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "person")
public class Person extends User {

    @NotNull
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    @Column(name = "birth_date", nullable = false)
    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate birthDate;

    @Column(name = "country_id")
    private int country_id;

    @Column(name = "city_id")
    private int city_id;

    private enum gender {Male, Female};

}

