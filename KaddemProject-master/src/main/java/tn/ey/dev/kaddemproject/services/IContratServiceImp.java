package tn.ey.dev.kaddemproject.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.ey.dev.kaddemproject.entities.Contrat;
import tn.ey.dev.kaddemproject.entities.Etudiant;
import tn.ey.dev.kaddemproject.repositories.ContratRepository;
import tn.ey.dev.kaddemproject.repositories.EtudiantRepository;

import java.util.List;
import javax.transaction.Transactional;


@Service
@RequiredArgsConstructor
public class IContratServiceImp implements IContratServices {

    private ContratRepository contratRepository;
    private final EtudiantRepository etudiantRepository;
    @Override
    public void ajouterContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public void updateContrat(Contrat c) {
        contratRepository.save(c);
    }

    @Override
    public List<Contrat> getAllContrat() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat getByIdContrat(Integer id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteContrat(Integer id) {
        contratRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Contrat affecteContratToEtudiant(Contrat ce, String nomE, String prenomE) {
        //we used the method findbynomeandprenomE created in repository to get the nom and prenom of an etudiant
        Etudiant etudiant = etudiantRepository.findByNomEAndPrenomE(nomE,prenomE);
        Contrat contrat = contratRepository.findById(ce.getIdContrat()).orElse(null);
        Assert.notNull(etudiant,"Etudiant 404 not found");
        Assert.notNull(contrat,"Contrat 404 not found");
        if (etudiant.getContrats().size() >= 5 ) {
            return null;
        }
        etudiant.getContrats().add(contrat);
        etudiantRepository.save(etudiant);
        return contrat;
    }
}
