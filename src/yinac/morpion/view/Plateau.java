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
import javax.swing.SwingUtilities;
import javax.swing.text.View;
import sun.tools.jar.Main;

/**
 *
 * @author imie
 */
public class Plateau extends JFrame {

    public void init() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());

        JPanel panelPseudoTop = new JPanel();
        JLabel labelPseudoPlayer1 = new JLabel("Joueur 1 :");
        JTextField tfPseudoPlayer1 = new JTextField();
        JLabel labelPseudoPlayer2 = new JLabel("Joueur 2 :");
        JTextField tfPseudoPlayer2 = new JTextField();

        panelPseudoTop.setLayout(new BoxLayout(panelPseudoTop, BoxLayout.X_AXIS));
        panelPseudoTop.add(labelPseudoPlayer1);
        panelPseudoTop.add(tfPseudoPlayer1);
        panelPseudoTop.add(labelPseudoPlayer2);
        panelPseudoTop.add(tfPseudoPlayer2);
        

        JPanel panelCentral = new JPanel();
        panelCentral.setSize(500, 500);
        panelCentral.setLayout(new BorderLayout());
        TheGrid grid = new TheGrid();
        grid.setSize(400, 400);
        panelCentral.add(grid, BorderLayout.CENTER);
        setSize(500, 500);

        add(panelPseudoTop, BorderLayout.NORTH);
        add(panelCentral, BorderLayout.CENTER);
        
        //pack();
        setVisible(true);

    }
   // }
}
