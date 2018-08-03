/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Administrateur
 */
// on met que @service sur les classes et non sur les interface (ici nous sommes ds un interface)
// une interface ne possede pas de code, juste des definition, pas de variables..
public interface CompteurService {
    
    // interface donc pas d'accolade on déclare juste la fonction
    public long listerTotalEnergieDepensee(String ville);
}
