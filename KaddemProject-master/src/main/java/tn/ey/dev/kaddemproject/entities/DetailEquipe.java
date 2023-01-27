package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DetailEquipe {

    @Id
    private int idDetailEquipe;
    int salle;
    String thematique;

}
