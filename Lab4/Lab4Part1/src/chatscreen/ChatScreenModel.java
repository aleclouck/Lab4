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
public class ChatScreenModel {
     /**
     * This gets the text the user entered and outputs it
     * in the display area.
     */
    public void displayText(JTextField sendText, JTextArea displayArea) {
        String message = sendText.getText().trim();
        StringBuilder buffer = new StringBuilder(message.length());

        // now reverse it
        for (int i = message.length()-1; i >= 0; i--)
            buffer.append(message.charAt(i));

        displayArea.append(buffer.toString() + "\n");

        sendText.setText("");
        sendText.requestFocus();
    }
}
