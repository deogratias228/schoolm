/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Classe;
import deo.schoolm.primaire.entities.Evaluation;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface EvaluationDao {
    public void ajouter(Evaluation e);
    public void supprimer(Evaluation e);
    public void supprimer(Integer id);
    public Evaluation modifier(Evaluation e);
    public Evaluation trouver(Integer id);
    public List<Evaluation> lister();
    public List<Evaluation> lister(Classe classe);
    public List<Evaluation> lister(String intitule);
}
