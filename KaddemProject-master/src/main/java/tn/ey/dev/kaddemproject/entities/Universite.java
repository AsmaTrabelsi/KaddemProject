package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universite {

    @Id
    private int idUniv;
    String nomUniv;
}
