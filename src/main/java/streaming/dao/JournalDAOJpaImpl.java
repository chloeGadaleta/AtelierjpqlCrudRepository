/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import streaming.entity.Journal;

/**
 *
 * @author Administrateur
 */
@Repository
public class JournalDAOJpaImpl implements JournalDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insert(Journal j) {
        em.persist(j);
    }
    
}
