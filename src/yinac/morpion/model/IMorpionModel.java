/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yinac.morpion.model;

import java.awt.Dimension;

/**
 *
 * @author imie
 */
public interface IMorpionModel {
    public enum Cell{
        empty,
        cross,
        circle
    };
    
    public enum GameState{
        running,
        draw,
        won
    }
    
    public Cell getCellAt(int row, int column);
    public int getRowCount();
    public int getColumnCount();
    public GameState getGameState();
    public Player getNextPlayer();
    public Player getWinner();
    public Player getCirclePlayer();
    public Player getCrossPlayer();
    public Cell getCellTypeFromPlayer(Player player);
}
