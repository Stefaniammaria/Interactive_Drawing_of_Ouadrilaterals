package Model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="intrebare")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Question implements Serializable {

    @javax.persistence.Id
    @Column(unique = true, nullable = false)
    @GeneratedValue
    private int Id;

    @Column(name = "enunt")
    private String enunt;

    @Column(name = "raspuns")
    private String raspuns;



}
