/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import streaming.entity.Film;

/**
 *
 * @author Administrateur
 */
// le crud va renvoyer des films, Long c'est le type de la clé primaire donc id donc Long

//ici pas besoin de noter @repository car c'est une interface

public interface FilmDAOCrud extends CrudRepository<Film, Long>{
    
    public Film findOneByTitre(String t);
    
    //5. Nombre de films réalisés par Polanski
    public long countByRealisateursNom(String nom);
    
    //6. Nombre de films interprétés par Polanski
    public long countByActeursNomAndActeursPrenom(String nom, String prenom);
    
    //7. Nombre de films à la fois interprétés et réalisés par polanski
    public long countByActeursNomAndRealisateursNom(String nomAct, String nomReal);
    
    //8. Le titre du film d'horreur anglais réalisé par roman polanski
    public Film findOneByGenreNomAndPaysNomAndRealisateursNomAndRealisateursPrenom(String genre, String pays, String realName, String realPrenom);

    //9. Le nomnbre de films réalisés par joel coen
    public long countByRealisateursNomAndRealisateursPrenom(String nom, String prenom);
    
    //10. Le nombre de films réalisés à la fois par les 2 frères coen
    // Celle-ci comporte des intersect ducoup on ne peut pas la faire sans requette jpql
    
    @Query("     SELECT     COUNT(f)"
            + "  FROM       Film f"
            + "             JOIN f.realisateurs r1 "
            + "             JOIN f.realisateurs r2 "
            + "  WHERE      r1.nom=:r1Nom"
            + "             AND r1.prenom=:r1Prenom "
            + "             AND r2.nom=:r2Nom "
            + "             AND r2.prenom=:r2Prenom")
    public long compteFilmsRealisesParDeuxReal(@Param("r1Prenom") String prenomReal1,@Param("r1Nom") String nomReal1,@Param("r2Prenom") String prenomReal2,@Param("r2Nom") String real2);
    
    
    //11. Le nombre de films réalisés à la fois par les 2 frères Coen, et interprétés par Steve Buscemi
    
    @Query("    SELECT      COUNT(f)"
            + " FROM        Film f"
            + "             JOIN f.realisateurs r1"
            + "             JOIN f.realisateurs r2"
            + "             JOIN f.acteurs a"
            + " WHERE       r1.nom=:r1Nom "
            + "             AND r1.prenom=:r1Prenom"
            + "             AND r2.nom=:r2Nom"
            + "             AND r2.prenom=:r2Prenom"
            + "             AND a.nom=:aNom"
            + "             AND a.prenom=:aPrenom"
    )
    
    public long compteFilmsRealParDeuxRealEtAvecUnActeur(
            @Param("r1Prenom") String prenomReal1, 
            @Param("r1Nom") String nomReal1,
            @Param("r2Prenom") String prenomReal2,
            @Param("r2Nom") String real2, 
            @Param("aNom") String actNom, 
            @Param("aPrenom") String act1Nom
    );
    
    //12. Le nombre de films policiers réalisés à la fois par les 2 frères Coen, et interprétés par Steve Buscemi
    
    @Query("    SELECT      COUNT(f)"
            + " FROM        Film f"
            + "             JOIN f.realisateurs r1"
            + "             JOIN f.realisateurs r2"
            + "             JOIN f.acteurs a"
            + "             JOIN f.genre g"
            + " WHERE       r1.nom=:r1Nom "
            + "             AND r1.prenom=:r1Prenom"
            + "             AND r2.nom=:r2Nom"
            + "             AND r2.prenom=:r2Prenom"
            + "             AND a.nom=:aNom"
            + "             AND a.prenom=:aPrenom"
            + "             AND g.nom=:aGenre"
    )
    
    public long compteFilmsPoliciersRealParDeuxRealEtInterpretesParSB(
            @Param("r1Prenom") String prenomReal1, 
            @Param("r1Nom") String nomReal1,
            @Param("r2Prenom") String prenomReal2,
            @Param("r2Nom") String real2, 
            @Param("aNom") String actNom, 
            @Param("aPrenom") String act1Nom,
            @Param("aGenre") String genreFilm
    );
}
