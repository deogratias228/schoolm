/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Cours;
import deo.schoolm.utils.Connexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Deo Gratias 228
 */
public class CoursDaoImpl implements CoursDao{

    @Override
    public void ajouter(Cours cours) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.persist(cours);
            em.getTransaction().begin();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Cours cours) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.remove(cours);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Integer id) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            Cours cours = em.find(Cours.class, id);
            supprimer(cours);
        } finally {
            em.close();
        }
    }

    @Override
    public Cours modifier(Cours cours) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cours trouver(Integer id) {
        EntityManager em = Connexion.getConnexion();
        Cours cours = null;
        
        try {
            cours = em.find(Cours.class, id);
        } finally {
            em.close();
        }
        
        return cours;
    }

    @Override
    public List<Cours> lister() {
        EntityManager em = Connexion.getConnexion();
        List<Cours> cours = null;
        
        try {
            Query query = em.createQuery("SELECT cours FROM Cours cours");
            cours = query.getResultList();
        } finally {
            em.close();
        }
        
        return cours;
    }
    
}
