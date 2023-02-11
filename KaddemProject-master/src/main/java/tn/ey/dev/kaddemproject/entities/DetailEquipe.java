package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetailEquipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idDetailEquipe;
    private int salle;
    private String thematique;

}
