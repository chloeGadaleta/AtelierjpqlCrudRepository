/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import streaming.entity.Serie;

/**
 *
 * @author Administrateur
 */
@Repository
public class SerieDAOJpaImpl implements SerieDAO{

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public List<Serie> lister() {
        return em.createQuery("SELECT s FROM Serie s").getResultList();
    }

    @Override
    public List<Serie> findByTitre(String titre) {
        return em.createQuery("SELECT s FROM Serie s WHERE s.titre LIKE :t").setParameter("t", "%" + titre + "%").getResultList();
        // attention avec le like bien utiliser "%" + + "%"
    }

    @Override
    public void insert(Serie s) {
        em.persist(s);
    }
    
}
