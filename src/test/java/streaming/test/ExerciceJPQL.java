/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import streaming.entity.Lien;

/**
 *
 * @author Administrateur
 */
public class ExerciceJPQL {
    
    @Test
    public void req24(){
        
// 24. Le nombre total de saisons pour chaque série, triés par ordre croissant de saisons, puis par ordre alphabétique.
    
    EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    
    Query query = em.createNamedQuery(" SELECT COUNT(sa)  "
            + "                         FROM Saison sa  "
                + "                          JOIN sa.serie se ORDER BY ASC "
                + "                          JOIN se.titre t ORDER BY ASC"
            + "                         WHERE "
    
    );
            
            
     }



    @Test
    public void req13(){

// 13. Le nombre de saisons de la série Dexter

    EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    
    Query query = em.createQuery(" SELECT COUNT(sa)"
            + "                    FROM Saison sa"
            + "                         JOIN sa.serie se"
            + "                    WHERE se.titre='Dexter'"
    );
        
        long l = (long) query.getSingleResult();
        
        assertEquals(8L, l);
    }
    
    
    @Test
    public void req8(){
        
//  8. Le titre du film d'horreur anglais réalisé par roman polanski

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery(" SELECT f.titre "
                + "                    FROM Film f"
                + "                         JOIN f.genre g"
                + "                         JOIN f.pays p"
                + "                         JOIn f.realisateurs r"
                + "                    WHERE g.nom='Horreur'"
                + "                    AND p.nom='UK'"
                + "                    AND r.nom='Polanski'"
        );
    
        String l = (String) query.getSingleResult();
        
        assertEquals("", "");
    }
    
    
    @Test
    public void req7(){
        
// 7. Nombre de films à la fois interprétés et réalisés par polanski

        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery(" SELECT COUNT (f)"
                + "                    FROM Film f "
                + "                         JOIN f.acteurs a"
                + "                         JOIN f.realisateurs r"
                + "                    WHERE a.nom='Polanski'"
                + "                    AND r.nom = 'Polanski' "
        );
        
        long l = (long) query.getSingleResult();
        
        assertEquals(1L, l);
    }
    
    
    @Test
    public void req6(){
        
// 6. Nombre de films interprétés par Polanski
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery(" SELECT COUNT(f)"
                + "                    FROM Film f"
                + "                          JOIN f.acteurs a"
                + "                    WHERE a.nom='Polanski'");
        
        long l = (long) query.getSingleResult();
        
        assertEquals(1L, l);
        
    }
    
    
    @Test
    public void req5(){
       
       // requete 4 
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("  SELECT COUNT(f) "
                + "                     FROM   Film f"
                + "                          JOIN f.realisateurs r "
                + "                     WHERE r.nom='Polanski'");
        long l = (long) query.getSingleResult();
        
        assertEquals(2L, l);
    }
  
    @Test
    public void req4(){
       
       // requete 4 
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        
        Query query = em.createQuery("  SELECT COUNT(l) "
                + "                     FROM Lien l"
                + "                          JOIN l.film f "
                + "                     WHERE f.titre='Big Lebowski (The)'");
        Long nbLiens = (Long) query.getSingleResult();
        
        assertEquals(new Long(1), nbLiens);
    }
}
