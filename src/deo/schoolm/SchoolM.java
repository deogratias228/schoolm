/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deo.schoolm;

import deo.schoolm.entities.Eleve;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Deo Gratias 228
 */
public class SchoolM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EntityManager em = null;
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("thePU");
            System.out.println("Emf ok..");
            
            try {
                em = emf.createEntityManager();
                System.out.println("Tout est ok now");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        Eleve e = new Eleve("Kodjogan", "Komi Jean", "Kodjogan Yao Eric", "99866863");
        
        EntityTransaction et = em.getTransaction();
        
        et.begin();
            em.persist(e);
        et.commit();
        
    }
    
}
