package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Table( name = "Etudiants")
@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idEtudaint;

    String prenomE;
    String nomE;
     Option option;
}
