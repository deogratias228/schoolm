/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Eleve;
import deo.schoolm.primaire.entities.Evaluation;
import deo.schoolm.primaire.entities.Matiere;
import deo.schoolm.primaire.entities.Note;
import deo.schoolm.utils.Connexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Deo Gratias 228
 */
public class NoteDaoImpl implements NoteDao{

    @Override
    public void ajouter(Note note) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.persist(note);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Note note) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.remove(note);
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
    public Note modifier(Note note) {
        EntityManager em = Connexion.getConnexion();
        Note noteModifiee = null;
        
        try {
            em.getTransaction().begin();
            Note noteExistant = trouver(note.getId());
            
            if (noteExistant != null){
                noteExistant.setEleve(note.getEleve());
                noteExistant.setEvaluation(note.getEvaluation());
                noteExistant.setMatiere(note.getMatiere());
                noteExistant.setNote_obtenue(note.getNote_obtenue());

                noteModifiee = em.merge(noteExistant);
            }
            
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        
        
        return noteModifiee;
    }

    @Override
    public Note trouver(Integer id) {
        EntityManager em = Connexion.getConnexion();
        
        return em.find(Note.class, id);
    }

    @Override
    public List<Note> lister() {
        EntityManager em = Connexion.getConnexion();
        List<Note> liste = null;
        
        try {
            Query query = em.createQuery("SELECT note FROM Note note");
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }
        
    @Override
    public List<Note> lister(double note) {
        EntityManager em = Connexion.getConnexion();
        List<Note> liste = null;
        
        try {
            Query query = em.createQuery("SELECT note FROM Note note WHERE note.noteObtenue = :data");
            query.setParameter("data", "%"+note+"%");
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }

    @Override
    public List<Note> lister(String filter) {
        EntityManager em = Connexion.getConnexion();
        List<Note> liste = null;
        
        try {
            Query query = em.createQuery(""
                    + " SELECT note FROM Note note"
                    + " WHERE note.evaluation.intitule LIKE :data"
                    + " OR note.eleve.eleveNom LIKE :data"
                    + " OR note.matiere LIKE :data");
            query.setParameter("data", "%"+filter+"%");
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }
    
}
