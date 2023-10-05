/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Matiere;
import deo.schoolm.utils.Connexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Deo Gratias 228
 */
public class MatiereDaoImpl implements MatiereDao {

    @Override
    public void ajouter(Matiere m) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.persist(m);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Matiere m) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.remove(m);
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
    public Matiere modifier(Matiere m) {
        EntityManager em = Connexion.getConnexion();
        Matiere matiereModifiee = null;
        
        try {
            em.getTransaction().begin();
            Matiere matiereEx = trouver(m.getId());
            
            if(matiereEx != null){
                matiereEx.setCours(m.getCours());
                matiereEx.setEleves(m.getEleves());
                matiereEx.setIntitule(m.getIntitule());
                matiereEx.setNoteMaxi(m.getNoteMaxi());
                matiereEx.setNotes(m.getNotes());
                
                matiereModifiee = em.merge(matiereEx);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        
        return matiereModifiee;
    }

    @Override
    public Matiere trouver(Integer id) {
        EntityManager em = Connexion.getConnexion();
        
        return em.find(Matiere.class, id);
    }

    @Override
    public List<Matiere> lister() {
        EntityManager em = Connexion.getConnexion();
        List<Matiere> liste = null;
        
        try {
            Query query = em.createQuery("SELECT matiere FROM Matiere matiere");
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }

    @Override
    public List<Matiere> lister(double note) {
        EntityManager em = Connexion.getConnexion();
        List<Matiere> liste = null;
        
        try {
            Query query = em.createQuery(""
                    + " SELECT matiere FROM Matiere matiere"
                    + " WHERE matiere.noteMaxi = :note");
            query.setParameter("note", note);
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }

    @Override
    public List<Matiere> lister(String search) {
        EntityManager em = Connexion.getConnexion();
        List<Matiere> liste = null;
        
        try {
            Query query = em.createQuery(""
                    + " SELECT matiere FROM Matiere matiere"
                    + " WHERE matiere.intitule LIKE :search"
                    + " OR matiere.cours.code LIKE :search ");
            
            query.setParameter("search", "%"+search+"%");
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }   
    
}
