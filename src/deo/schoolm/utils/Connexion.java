/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Deo Gratias 228
 */
public class Connexion {
    private static EntityManager em = null;
    
    static {
        try {
            EntityManagerFactory emf;
            emf = Persistence.createEntityManagerFactory("thePU");
            try {
                em = emf.createEntityManager();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
   
    private Connexion(){
        
    }
    
    public static EntityManager getConnexion(){
        return em;
    }
}
