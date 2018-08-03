/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Administrateur
 */
@Service
public class CompteurServiceImpl implements CompteurService{
    
     
    @Autowired
    private JournalService journalService;
    
    @Override
    public long listerTotalEnergieDepensee(String ville) {
        
       // faire un log ds le journal
        
        if (ville.equals("Grenoble"))
            return 100000;
        if (ville.equals("Paris")) 
            return 1000000;
        
        return 10000;
        
    }
}
