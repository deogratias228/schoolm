/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Eleve;
import deo.schoolm.utils.Connexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Deo Gratias 228
 */
public class EleveDaoImpl implements EleveDao {

    @Override
    public void ajouter(Eleve eleve) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.persist(eleve);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Integer id) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            Eleve e = em.find(Eleve.class, id);
            supprimer(e);
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Eleve eleve) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.remove(eleve);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public Eleve modifier(Eleve eleve) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Eleve trouver(Integer id) {
        EntityManager em = Connexion.getConnexion();
        Eleve e = null;
        
        try {
            e = em.find(Eleve.class, id);
        } finally {
            em.close();
        }
        
        return e;
    }

    @Override
    public List<Eleve> lister() {
        List<Eleve> liste = null;
        EntityManager em = Connexion.getConnexion();
        
        try {
            Query query = em.createQuery("SELECT e FROM Eleve e");
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }

    @Override
    public List<Eleve> lister(String eleveTuteurContact) {
        List<Eleve> liste = null;
        EntityManager em = Connexion.getConnexion();
        
        try {
            Query query = em.createQuery(""
                    + " SELECT eleve FROM Eleve eleve WHERE"
                    + " (eleve.eleveNom OR eleve.elevePrenom OR"
                    + " eleve.tuteurNom OR eleve.tuteurContact )"
                    + " LIKE :data");
            query.setParameter(":data", eleveTuteurContact);
            
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }

    @Override
    public List<Eleve> lister(long anneeNaissance) {
        List<Eleve> liste = null;
        EntityManager em = Connexion.getConnexion();
        
        try {
            Query query = em.createQuery(""
                    + " SELECT eleve FROM Eleve eleve WHERE"
                    + " (eleve.eleveMatricule OR eleve.eleveNaissance )"
                    + " LIKE :data");
            query.setParameter(":data", anneeNaissance);
            
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;   
    }
    
}
