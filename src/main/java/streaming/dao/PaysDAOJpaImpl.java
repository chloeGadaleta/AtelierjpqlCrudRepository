/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Repeat;
import streaming.entity.Pays;

/**
 *
 * @author Administrateur
 */
@Repository
public class PaysDAOJpaImpl implements PaysDAO{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Pays p) {
        em.persist(p);
    }

    @Override
    public void remove(Pays p) {
        em.remove(p);
    }

    @Override
    public List<Pays> listerOrdreAlpha(String nom) {
        return em.createQuery("SELECT p FROM Pays p").getResultList();
    }
    
    
}
