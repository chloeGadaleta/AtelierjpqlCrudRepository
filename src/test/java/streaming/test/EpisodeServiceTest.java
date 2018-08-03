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
import streaming.dao.EpisodeDAOCrud;
import streaming.dao.LienDAOCrud;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class EpisodeServiceTest {
    
    @Autowired
    private EpisodeDAOCrud dao;
    
    @Autowired
    private LienDAOCrud daoLien;
    
    @Test
    public void test(){
        
        System.out.println("***" + daoLien.countByFilmGenreNomAndFilmActeursNom("Horreur", "Polanski"));
    }

}
