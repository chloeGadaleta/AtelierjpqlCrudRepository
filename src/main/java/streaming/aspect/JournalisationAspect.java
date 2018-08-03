/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import streaming.service.JournalService;

/**
 *
 * @author Administrateur
 */
@Aspect
@Component
public class JournalisationAspect {
    //but de l'aspect est d'enlever tous les autowired
    
    @Autowired
    private JournalService jservice;
    
    @Before( "execution(* streaming.service.*.*(..)) "
            + "and not execution (* streaming.service.JournalService.*(..))")
    // ici on cible ttes les fonction de la classe filmservice ds service.. (..) -> les deux parametres de la fonction
    public  void avant(JoinPoint jp){
        
        jservice.log("JPP --> " + jp.toString());
    }
}
