package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Table( name = "Etudiants")
@Entity
public class Etudiant {

    @Id
    private int idEtudaint;

    String prenomE;
    String nomE;
    // Option option
}
