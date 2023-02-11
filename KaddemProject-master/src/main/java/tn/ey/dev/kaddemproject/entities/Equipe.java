package tn.ey.dev.kaddemproject.entities;

import javax.persistence.*;

@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    String nomEquipe;
    @Enumerated(EnumType.STRING)
     Niveau niveau;
}
