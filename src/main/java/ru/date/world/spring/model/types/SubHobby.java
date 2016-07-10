package ru.date.world.spring.model.types;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "subhobby")
public class SubHobby {

    @Id
    @SequenceGenerator(name = "subhobby_id_seq",
            sequenceName = "subhobby_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "subhobby_id_seq")
    @Column(name = "id", updatable = false)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "subhobby_name", nullable = false)
    private String subHobbyName;

    @OneToOne
    @JoinColumn(name = "id")
    private Hobby hobby;
}
