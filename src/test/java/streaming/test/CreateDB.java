/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.config.SpringConfig;
import streaming.service.Service10;
import streaming.service.Service11;

/**
 *
 * @author tom
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=SpringConfig.class)
public class CreateDB {
    
    @Autowired
    private Service10 s10;
    
    @Autowired
    private Service11 s11;
    
    
    @Test
    public void test(){
        s10.f1();
        s11.f1();
    }
}
