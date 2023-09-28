/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Instituteur;
import deo.schoolm.utils.Connexion;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Deo Gratias 228
 */
public class InstituteurDaoImpl implements InstituteurDao {

    @Override
    public void ajouter(Instituteur instituteur) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.persist(instituteur);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Instituteur instituteur) {
        EntityManager em = Connexion.getConnexion();
        
        try {
            em.getTransaction().begin();
                em.remove(instituteur);
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
    public Instituteur modifier(Instituteur instituteur) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Instituteur trouver(Integer id) {
        EntityManager em = Connexion.getConnexion();
        
        return em.find(Instituteur.class, id);
    }

    @Override
    public List<Instituteur> lister() {
        List<Instituteur> liste = null;
        EntityManager em = Connexion.getConnexion();
        
        try {
            Query query = em.createQuery("SELECT instituteur FROM Instituteur instituteur");
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }

    @Override
    public List<Instituteur> lister(String search) {
        List<Instituteur> liste = null;
        EntityManager em = Connexion.getConnexion();
        
        try {
            Query query = em.createQuery(""
                    + " SELECT instituteur FROM Instituteur instituteur"
                    + " WHERE (instituteur.gradeEchelon "
                    + " OR instituteur.nom"
                    + " OR instituteur.numeroMatricule "
                    + " OR instituteur.prenom "
                    + " OR instituteur.contact "
                    + " OR instituteur.titre)"
                    + " LIKE :search");
            query.setParameter(":search", search);
            liste = query.getResultList();
        } finally {
            em.close();
        }
        
        return liste;
    }
    
}
