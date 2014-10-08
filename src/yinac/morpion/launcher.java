/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion;

import yinac.morpion.controller.MorpionController;
import yinac.morpion.model.MorpionModel;
import yinac.morpion.model.Player;
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
        
        MorpionModel model = new MorpionModel(new Player("Pierre-Yves"), new Player("Clovis"));
        Plateau plateau = new Plateau(model);
        model.addObserver(plateau);
        MorpionController controller = new MorpionController(model, plateau);
        plateau.addObserver(controller);
    }
    
}
