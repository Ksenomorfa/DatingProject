package ru.date.world.spring.model.types;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "city")
public class City {
    @Id
    @SequenceGenerator(name = "city_id_seq",
            sequenceName = "city_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "city_id_seq")
    @Column(name = "id", updatable = false)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "city_name", nullable = false)
    private String cityName;

    @OneToOne
    @JoinColumn(name = "id")
    private Country country;
}
