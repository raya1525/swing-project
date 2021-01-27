/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projects;

/**
 *
 * @author rama
 */
import javax.swing.*;
public class snake extends JFrame{
    snake(){
        super("Snake Game");
        add(new board());
        pack();
        
        setLocationRelativeTo(null);
//        setTitle("Snake Game");
        setResizable(false);
      
    }
    
    public static void main(String[] args){
        new snake().setVisible(true);
    }
}
