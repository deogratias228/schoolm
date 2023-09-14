/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package deo.schoolm.primaire.dao;

import deo.schoolm.primaire.entities.Eleve;
import deo.schoolm.primaire.entities.Evaluation;
import deo.schoolm.primaire.entities.Matiere;
import deo.schoolm.primaire.entities.Note;
import java.util.List;

/**
 *
 * @author Deo Gratias 228
 */
public interface NoteDao {
    public void ajouter(Note note);
    public void supprimer(Note note);
    public void supprimer(Integer id);
    public Note modifier(Note note);
    public Note trouver(Integer id);
    public List<Note> lister();
    public List<Note> lister(Eleve eleve);
    public List<Note> lister(Evaluation evaluation);
    public List<Note> lister(Matiere matiere);
    public List<Note> lister(double note);
}
