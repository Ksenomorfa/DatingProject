package ru.date.world.spring.model.types;

import ru.date.world.spring.model.users.Person;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @SequenceGenerator(name = "country_id_seq",
            sequenceName = "country_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "country_id_seq")
    @Column(name = "id", updatable = false)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "country_name", nullable = false)
    private String countryName;

}
