/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.SerieDAO;
import streaming.entity.Serie;

/**
 *
 * @author Administrateur
 */
@Service
public class SerieServiceImpl implements SerieService{

    @Autowired
    private SerieDAO dAO;
    
    @Autowired
    private JournalService journalService;
    
    @Override
    public List<Serie> lister() {
        return dAO.lister();
    }

    @Override
    public List<Serie> findByTitre(String titre) {
        return dAO.findByTitre(titre);
    }
    
    
    @Override
    // pour toutes les fonctions transactionnelles,écrire isolation...
    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void insert(Serie s) {
        // à la place du s.get.. on peut mettre s tout seul ça ira automatiquement chercher le gettostring
        dAO.insert(s);
    }
    
}
