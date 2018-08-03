/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Lien;

/**
 *
 * @author Administrateur
 */
public interface LienDAOCrud extends CrudRepository<Lien, Long>{
    
    // renvoie tous les liens par titre de film
    // il faut le parcourir ds l'ordre de l'arborescence de nos entity ds lien on a film ds film titre
    // -> voilà pq byfilmtitre
    public List<Lien> findAllByFilmTitre(String title);
    public List<Lien> findAllByFilmRealisateursNom(String nom);
    // je veux compter tous les realisateurs
    public long countByFilmRealisateursNom(String nom);
    
    //16. Le nombre total de liens pour nos films policiers américains
    public long countByFilmGenreNomAndFilmPaysNom(String nomGenre, String nomPays);
    
    //17. Le nombre totals de liens pour nos films d'horreur interprétés par Polanski
    public long countByFilmGenreNomAndFilmActeursNom(String nomGenre, String nomActeur);
}
