/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Saison;

/**
 *
 * @author Administrateur
 */
public interface SaisonDAOCrud extends CrudRepository<Saison, Long>{
    
    //13. Le nombre de saisons de la série Dexter
    public long countBySerieTitre(String nom);
    

}
