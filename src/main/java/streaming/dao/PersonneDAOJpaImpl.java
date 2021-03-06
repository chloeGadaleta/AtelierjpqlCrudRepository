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
import streaming.entity.Personne;

/**
 *
 * @author Administrateur
 */
@Repository
public class PersonneDAOJpaImpl implements PersonneDAO{
    
    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Personne p) {
        em.persist(p);
    }

    @Override
    public void remove(Personne p) {
        em.remove(p);
    }

    @Override
    public List<Personne> listerOrdreAlpha(String nom) {
        return em.createQuery("SELECT p FROM Personne p").getResultList();
    }
}
