package tn.ey.dev.kaddemproject.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Contrat {

    @Id
    private int idContrat;
    Date dateDebutContrat;

    Date dateFinContrat;
    // Specilaite specialite;
    boolean archive;
    int montantContrat;



}
