/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.config.SpringConfig;
import streaming.dao.FilmDAOCrud;
import streaming.service.FilmService;

/**
 *
 * @author Administrateur
 */


//pour démarrer spring le test @runwith
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class FilmServiceTest {
 
    
    @Autowired
    private FilmDAOCrud dao;
    
    // avec spring on n'ecrit pas le new il se fait automatiquement avec l'autowired
    @Autowired
    private FilmService service;

    @Test
    public void test(){
        service.findById(1);
        service.list();
    }
    
}                                                                                                            
