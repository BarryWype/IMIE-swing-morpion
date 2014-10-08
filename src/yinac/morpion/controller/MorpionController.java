/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.controller;

import java.util.Observable;
import java.util.Observer;
import yinac.morpion.model.MorpionModel;
import yinac.morpion.view.Plateau;
import yinac.morpion.view.events.CellClickedEvent;
import yinac.morpion.view.events.MorpionViewEvent;

/**
 *
 * @author imie
 */
public class MorpionController implements Observer{
    private MorpionModel model;
    private Plateau view;

    public MorpionController(MorpionModel model, Plateau view) {
        this.model = model;
        this.view = view;
    }
    

    @Override
    public void update(Observable o, Object arg) {
        MorpionViewEvent event = (MorpionViewEvent)arg;
        if (event.getType() == MorpionViewEvent.Type.CellClicked) {
            CellClickedEvent cce = (CellClickedEvent)event;
            if (model.getCellAt(cce.row, cce.column) == MorpionModel.Cell.empty) {
                model.playCell(cce.row, cce.column);
            }
        }
    }
    
}
