package ru.date.world.spring.model.types;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @SequenceGenerator(name = "language_id_seq",
            sequenceName = "language_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "language_id_seq")
    @Column(name = "id", updatable = false)
    private int id;

    @Size(min = 2, max = 10)
    @Column(name = "language_code", nullable = false)
    private String languageCode;

    @Size(min = 2, max = 30)
    @Column(name = "language_name", nullable = false)
    private String languageName;
}
