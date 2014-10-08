/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.View;
import sun.tools.jar.Main;

/**
 *
 * @author imie
 */
public class Plateau extends JPanel{
    
    
    //public void init(){
    
        public static void main(String[] args) {

        JFrame panelPrincipal = new JFrame();
        panelPrincipal.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panelPrincipal.getContentPane().setLayout(new BorderLayout());
       
        JPanel panelPseudoTop = new JPanel();
        JLabel labelPseudoPlayer1 = new JLabel("Joueur 1 :");
        JLabel labelPseudoPlayer2 = new JLabel("Joueur 2 :");
        JTextField tfPseudoPlayer1 = new JTextField();
        JTextField tfPseudoPlayer2 = new JTextField();
        
        panelPseudoTop.setLayout(new BoxLayout(panelPseudoTop, View.X_AXIS));
        panelPseudoTop.add(labelPseudoPlayer1);
        panelPseudoTop.add(labelPseudoPlayer2);
        panelPseudoTop.add(tfPseudoPlayer1);
        panelPseudoTop.add(tfPseudoPlayer2);
        
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());
        panelCentral.add(new TheGrid(), BorderLayout.CENTER);
        
        panelPrincipal.add(panelPseudoTop, BorderLayout.NORTH);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        //panelPrincipal.pack();
        panelPrincipal.setVisible(true);
        
    }
   // }
}
