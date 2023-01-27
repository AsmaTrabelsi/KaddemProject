package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Equipe {
    @Id
    private int idEquipe;
    String nomEquipe;
    // Niveau niveau;
}
