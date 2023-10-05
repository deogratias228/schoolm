/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.services;

import deo.schoolm.primaire.entities.Evaluation;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface EvaluationService {
    public void ajouter(Evaluation e);
    public void supprimer(Evaluation e);
    public void supprimer(Integer id);
    public Evaluation modifier(Evaluation e);
    public Evaluation trouver(Integer id);
    public List<Evaluation> lister();
    public List<Evaluation> lister(String intituleOuClasse);
}
