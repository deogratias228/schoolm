/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Classe;
import deo.schoolm.utils.Connexion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

/**
 *
 * @author Deo Gratias 228
 */
public class ClasseDaoImpl implements ClasseDao {

    EntityManager em = Connexion.getConnexion();
    
    
    @Override
    public void ajouter(Classe classe) {
        try {
            EntityTransaction et = em.getTransaction();
            et.begin();
                em.persist(classe);
            et.commit();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
    }

    @Override
    public void supprimer(Classe classe) {
        em.remove(classe);
    }

    @Override
    public void supprimer(Integer id) {
        supprimer(trouver(id));
    }

    @Override
    public Classe modifier(Classe classe) {
        EntityManager em = Connexion.getConnexion();
        Classe cModifiee = null;
        
        try {
            em.getTransaction().begin();
            Classe cExistant = trouver(classe.getId());
            if(cExistant != null){
                cExistant.setCours(classe.getCours());
                cExistant.setDistingush(classe.getDistingush());
                cExistant.setEleves(classe.getEleves());
                cExistant.setEvaluations(classe.getEvaluations());
                cExistant.setInstituteur(classe.getInstituteur());
                
                cModifiee = em.merge(cExistant);
            }
            
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        
        return cModifiee;
    }

    @Override
    public Classe trouver(Integer id) {
        Classe c = null;
        try {
            em.getTransaction().begin();
                c = em.find(Classe.class, id);
            em.getTransaction().commit();            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            em.close();
        }
        
        return c;
    }

    @Override
    public List<Classe> lister() {
        List<Classe> liste = new ArrayList<>();
        
        try{
            Query query = em.createQuery("SELECT classe FROM Classe classe");
            liste = query.getResultList();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            em.close();
        }
        
        return liste;       
    }

    @Override
    public List<Classe> lister(String filter) {
        List<Classe> liste = new ArrayList<>();
        
        try {
            Query query = em.createQuery("SELECT classe FROM Classe classe WHERE classe.distingush LIKE :d OR classe.instituteur.nom LIKE :d");
            query.setParameter("d", filter);
            
            liste = query.getResultList();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            em.close();
        }
        
        return liste;   
    }

   
    
}