/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import streaming.dao.FilmDAOCrud;
import streaming.dao.FilmsDAO;
import streaming.entity.Film;
import streaming.entity.Journal;

/**
 *
 * @author Administrateur
 */
@Service // on met jamais service si c'est une interface
//@Transactional -> on peut aussi l'ajouter une fois ici
public class FilmServiceImpl implements FilmService{

    @Autowired
    private SecurityService securityService;
    
    @Autowired
    private FilmDAOCrud dao;
    
    @Autowired
    private JournalService service;
    
    @Override
    public Film findByTitre(String titre) {
        
        return  dao.findOneByTitre(titre);
    }
    

    @Override
    public Film findById(long idFilm) {
        return dao.findOne(idFilm);
    }

    @Transactional // mais n'est pas obligatoire car on l'a deja fait ds le dao
    @Override
    public void update(Film f) {
        dao.save(f);
    }

    @Transactional
    @Override
    public void insert(Film f) {
        dao.save(f);
    }

    @Override
    public Iterable<Film> list() {
        return dao.findAll();
    }

    @Transactional
    @Override
    public void removeAll() {
        dao.deleteAll();
    }
    
}
