/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Evaluation;
import deo.schoolm.utils.Connexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Deo Gratias 228
 */
public class EvaluationDaoImpl implements EvaluationDao {

    @Override
    public void ajouter(Evaluation e) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.persist(e);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Evaluation e) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.remove(e);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Integer id) {
        supprimer(trouver(id));
    }

    @Override
    public Evaluation modifier(Evaluation e) {
        EntityManager em = Connexion.getConnexion();
        Evaluation eModifiee = null;
        
        try {
            em.getTransaction().begin();
            Evaluation eExistant = trouver(e.getId());
            
            if(eExistant != null) {
                eExistant.setClasse(e.getClasse());
                eExistant.setIntitule(e.getIntitule());
                eExistant.setNotes(e.getNotes());
                eExistant.setObservations(e.getObservations());
                
                eModifiee = em.merge(eExistant);
            }
            
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        
        return eModifiee;
    }

    @Override
    public Evaluation trouver(Integer id) {
        EntityManager em = Connexion.getConnexion();
        
        return em.find(Evaluation.class, id);
    }

    @Override
    public List<Evaluation> lister() {
        EntityManager em = Connexion.getConnexion();
        List<Evaluation> evaluations = null;
        
        try {
            Query query = em.createQuery("SELECT evaluation FROM Evaluation evaluation");
            evaluations = query.getResultList();
        } finally {
            em.close();
        }
        
        return evaluations;
    }

    @Override
    public List<Evaluation> lister(String intituleOuClasse) {
        EntityManager em = Connexion.getConnexion();
        List<Evaluation> liste = null;
        
        try {
            Query query = em.createQuery(""
                    + " SELECT evaluation FROM Evaluation evaluation"
                    + " WHERE evaluation.intitule LIKE :data "
                    + " OR evaluation.classe.cours.code LIKE :data "
                    );
            query.setParameter("data", "%"+intituleOuClasse+"%");
            liste = query.getResultList();
            
        } finally {
            em.close();
        }
        
        return liste;
    }

    
}
