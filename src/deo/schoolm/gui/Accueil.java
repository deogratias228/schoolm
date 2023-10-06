/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.gui;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Deo Gratias 228
 */
public class Accueil extends JPanel{
    JTabbedPane onglets;
    JPanel panel;
    
    public Accueil() {
        super();
        onglets = new JTabbedPane(SwingConstants.TOP);
        panel = new JPanel();
        panel.setBackground(Color.red);
        onglets.addTab("ACCUEIL", panel);
        
        this.add(onglets);
    }
}
