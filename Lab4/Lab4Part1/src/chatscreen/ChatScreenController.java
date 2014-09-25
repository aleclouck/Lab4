package chatscreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro.guzman885
 */
public class ChatScreenController {
    
    private static ChatScreenModel model = new ChatScreenModel();
    private static ChatScreenView view = new ChatScreenView();
    
    public static void main(String[] args) {
        
        
        view.setSendListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        Object source = e.getSource();

	if (source == view.getSendButton()) 
            model.displayText(view.getSendText(), view.getDisplayArea());
        }
       });
        
        view.setExitListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            
        Object source = e.getSource();
	if (source == view.getExitButton())
            System.exit(0);
        }
       });
    }

}
    
