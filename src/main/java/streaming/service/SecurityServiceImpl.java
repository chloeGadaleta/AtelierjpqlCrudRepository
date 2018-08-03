/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.stereotype.Service;

/**
 *
 * @author Administrateur
 */
@Service
public class SecurityServiceImpl implements SecurityService{

    
    @Override
    public void checkisAutorized(String action) {
        
        String role = "visiteur"; // En vrai on recup l'info en session en utilisany la technique qui va bien.
        
        if(! role.equals("ADMIN") && role.contains("delecte") || action.contains("remove")){
            throw new RuntimeException("Opération interdite");
        }
        
        
        
// OU BIEN  mais fonction pas void mais boolean      
//        if (!role.equals("ADMIN")){
//          return true;
//        }
//        
//        //je ne suis pas admin  
//        if (action.contains("delete")) {
//            return false;
//        }
//        
//        return false;
        
    }

}
