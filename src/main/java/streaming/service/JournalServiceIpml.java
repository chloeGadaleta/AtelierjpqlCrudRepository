/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.JournalDAO;
import streaming.entity.Journal;
import static streaming.entity.Journal_.dateEtHeure;

/**
 *
 * @author Administrateur
 */
@Service
public class JournalServiceIpml implements JournalService{

    @Autowired
    private JournalDAO dAO;
    
    @Transactional
    @Override
    public void log(String msg) {
        
        
        Journal nouveauJournal = new Journal();
        
        nouveauJournal.setMsg(msg);
        nouveauJournal.setDateEtHeure(new Date());

        dAO.insert(nouveauJournal);
    }
    
}
