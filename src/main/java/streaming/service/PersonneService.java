/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.entity.Personne;

/**
 *
 * @author Administrateur
 */
public interface PersonneService {
    
    public void insert(Personne p);
    public void remove(Personne p);
    public List<Personne> listerOrdreAlpha(String nom);
}
