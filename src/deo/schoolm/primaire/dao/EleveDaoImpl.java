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
    public Eleve modifier(Eleve e) {
        EntityManager em = Connexion.getConnexion();
        Eleve eModifiee = null;
        
        try {
            em.getTransaction().begin();
            Eleve eExistant = trouver(e.getId());
            if(eExistant != null){
                eExistant.setClasse(e.getClasse());
                eExistant.setEleveMatricule(e.getEleveMatricule());
                eExistant.setEleveNaissance(e.getEleveNaissance());
                eExistant.setEleveNom(e.getEleveNom());
                eExistant.setElevePrenom(e.getElevePrenom());
                eExistant.setMatieres(e.getMatieres());
                eExistant.setNotes(e.getNotes());
                eExistant.setTuteurContact(e.getTuteurContact());
                eExistant.setTuteurNom(e.getTuteurNom());
                
                eModifiee = em.merge(eExistant);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        
        return eModifiee;
    }

    @Override
    public Eleve trouver(Integer id) {
        EntityManager em = Connexion.getConnexion();
        return em.find(Eleve.class, id);
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
    public List<Eleve> lister(String filter) {
        List<Eleve> liste = null;
        EntityManager em = Connexion.getConnexion();
        
        try {
            Query query = em.createQuery(""
                    + " SELECT eleve FROM Eleve eleve WHERE"
                    + " eleve.eleveNom LIKE :data"
                    + " OR eleve.elevePrenom LIKE :data"
                    + " OR eleve.tuteurNom LIKE :data"
                    + " OR eleve.tuteurContact LIKE :data");
            query.setParameter("data", "%"+filter+"%");
            
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
                    + " CAST(eleve.eleveMatricule AS string) LIKE :data OR CAST(eleve.eleveNaissance AS string) LIKE :data");
            query.setParameter("data", "%"+anneeNaissance+"%");
            
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;   
    }
    
}
