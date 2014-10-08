/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.view.events;

/**
 *
 * @author imie
 */
public class CellClickedEvent extends MorpionViewEvent {

    final public int row, column;
    public CellClickedEvent(int row, int column) {
        super(Type.CellClicked);
        this.row = row;
        this.column = column;
    }
    
}
