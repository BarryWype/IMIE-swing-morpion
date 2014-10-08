/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.model.events;

/**
 *
 * @author imie
 */
public class CellChangeEvent extends MorpionEvent {

    public final int row, column;
    public CellChangeEvent(int row, int column) {
        super(Type.CellChange);
        this.row = row;
        this.column = column;
    }
    
}
