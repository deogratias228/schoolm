/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deo.schoolm;

import deo.schoolm.utils.Connexion;
import javax.persistence.EntityManager;
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
        EntityManager em = Connexion.getConnexion();
        
    }
    
}
