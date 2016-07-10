package ru.date.world.spring.model.types;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "hobby")
public class Hobby {

    @Id
    @SequenceGenerator(name = "hobby_id_seq",
            sequenceName = "hobby_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "hobby_id_seq")
    @Column(name = "id", updatable = false)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "hobby_name", nullable = false)
    private String hobbyName;
}
