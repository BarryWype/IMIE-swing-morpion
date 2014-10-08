/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion;

import javax.swing.SwingUtilities;
import yinac.morpion.view.Plateau;

/**
 *
 * @author imie
 */
public class launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                Plateau plateau = new Plateau();
                plateau.init();
            }
        });
    }
    
}
