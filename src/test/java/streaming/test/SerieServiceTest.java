/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.config.SpringConfig;
import streaming.entity.Serie;
import streaming.service.SerieService;

/**
 *
 * @author Administrateur
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringConfig.class)
public class SerieServiceTest {
    
    @Autowired 
    private SerieService service;
    
    private SerieService serieService;
    
    @Test
    public void ajout(){
        
        Serie s = new Serie();
        s.setTitre("GOT");
        service.insert(s);
        
    }
}
