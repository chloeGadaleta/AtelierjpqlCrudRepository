/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Episode;

/**
 *
 * @author Administrateur
 */
public interface EpisodeDAOCrud extends CrudRepository<Episode, Long>{
    
    
    //14. Le nombre total d'épisodes de la série Dexter
    public long countBySaisonSerieTitre(String nom);
    
    //15. Le nombre d'épisodes de la saison 8 de la série Dexter
    public long countBySaisonSerieTitreAndSaisonNumSaison(String nom, String numSaison);
}
