package Model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="user")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User implements Serializable {

    @Id
    @Column(unique = true, nullable = false)
    @GeneratedValue
    private int Id;

    @Column(name = "nume")
    private String nume;

    @Column(name = "prenume")
    private String prenume;

    @Column(name = "tip")
    private String tip;

    @Column(name = "username")
    private String username;

    @Column(name = "parola")
    private String parola;

    @Column(name = "email")
    private String email;
}
