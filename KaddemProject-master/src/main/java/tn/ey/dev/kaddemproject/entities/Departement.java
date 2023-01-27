package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departement {
    @Id
    private int idDepart;
    String nomDepart;
}
