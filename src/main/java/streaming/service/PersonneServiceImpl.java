/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.PersonneDAO;
import streaming.entity.Personne;
import streaming.entity.Serie;

/**
 *
 * @author Administrateur
 */
@Service
public class PersonneServiceImpl implements PersonneService{
    
    @Autowired
    private PersonneDAO dAO;
    
    @Autowired
    private JournalService journalService;

    @Transactional
    @Override
    public void insert(Personne p) {
        dAO.insert(p);
    }

    @Transactional 
   @Override
    public void remove(Personne p) {
        dAO.remove(p);
    }

    @Override
    public List<Personne> listerOrdreAlpha(String nom) {
        return dAO.listerOrdreAlpha(nom);
    }
    

    
}
