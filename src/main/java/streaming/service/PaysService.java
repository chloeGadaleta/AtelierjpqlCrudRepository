/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import streaming.entity.Pays;

/**
 *
 * @author Administrateur
 */
public interface PaysService {
    
    public void insert(Pays p);
    public void remove(Pays p);
    public List<Pays> listerOrdreAlpha(String nom);
}
