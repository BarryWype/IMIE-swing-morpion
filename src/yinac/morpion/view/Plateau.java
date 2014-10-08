/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yinac.morpion.view;

import java.awt.BorderLayout;
import java.util.Observable;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import yinac.morpion.model.IMorpionModel;
import yinac.morpion.view.events.CellClickedEvent;

/**
 *
 * @author imie
 */
public class Plateau extends Observable {

    private JFrame frame;
    private IMorpionModel model;

    public Plateau(IMorpionModel model) {
        this.model = model;
        this.frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout());

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
        TheGrid grid = new TheGrid(this, model);
        grid.setSize(400, 400);
        panelCentral.add(grid, BorderLayout.CENTER);

        frame.add(panelPseudoTop, BorderLayout.NORTH);
        frame.add(panelCentral, BorderLayout.CENTER);

        //pack();
        frame.setVisible(true);
    }

    public void cellClicked(int row, int column) {
        setChanged();
        notifyObservers(new CellClickedEvent(row, column));
    }

}
