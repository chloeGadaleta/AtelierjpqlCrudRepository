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
public class FacturationService {
    
    @Autowired
    private CompteurService compteurService;
    
    @Autowired
    private JournalService journalService; 
            
    public double calculerCoutEnergetique(String ville){
        
        journalService.log(ville);
        return 0.14 * compteurService.listerTotalEnergieDepensee(ville);
    }
}
