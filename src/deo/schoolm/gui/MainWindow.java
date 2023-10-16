/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deo.schoolm.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Deo Gratias 228
 */
public class MainWindow extends JFrame {
    private JPanel panel;
    private Accueil accueil;
    private JTabbedPane onglets;
    
    public MainWindow(){
        super("School Manager");
        this.setSize(new Dimension(600, 500));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        accueil = new Accueil();        
        
        onglets = new JTabbedPane(SwingConstants.TOP);
        onglets.addTab("Accueil", accueil);        
        
        panel = new JPanel(new BorderLayout());
        panel.add(onglets, BorderLayout.CENTER);
        
        this.getContentPane().add(panel);
        this.setVisible(true);
    }
    
}
