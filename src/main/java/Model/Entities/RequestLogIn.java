package Model.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="reguestlogin")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class RequestLogIn implements Serializable {

    @javax.persistence.Id
    @Column(unique = true, nullable = false)
    @GeneratedValue
    private int Id;

    @Column(name = "nume")
    private String nume;

    @Column(name = "prenume")
    private String prenume;

    @Column(name = "email")
    private String email;

}
