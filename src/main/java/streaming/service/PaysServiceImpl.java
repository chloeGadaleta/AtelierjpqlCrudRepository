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
import streaming.dao.PaysDAO;
import streaming.entity.Pays;

/**
 *
 * @author Administrateur
 */
@Service
public class PaysServiceImpl implements PaysService{

    @Autowired
    private PaysDAO dAO;
    
    @Autowired
    private JournalService service;
    
    @Transactional
    @Override
    public void insert(Pays p) {
        dAO.insert(p);
    }
    
    @Transactional
    @Override
    public void remove(Pays p) {
        dAO.remove(p);
    }

    @Override
    public List<Pays> listerOrdreAlpha(String nom) {
        return dAO.listerOrdreAlpha(nom);
    }
    
}
