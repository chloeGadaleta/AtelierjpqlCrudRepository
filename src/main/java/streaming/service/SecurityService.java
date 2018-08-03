/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

/**
 *Renvoie true si l'action est autorisée pr le role donné sinon renvoie false
 * 
 * @author Administrateur
 */
public interface SecurityService {
    
    public void checkisAutorized(String role);
}
