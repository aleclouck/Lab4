package chatscreen;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandro.guzman885
 */
public class ChatScreenView {
    private JButton sendButton = new JButton("Send");
    private JButton exitButton = new JButton("Exit");
    private JTextField sendText = new JTextField(30);
    private JTextArea displayArea = new JTextArea(15, 40);
    
    private JFrame frame;
    
    public JButton getSendButton() {
        return this.sendButton;
    }
    
    public JButton getExitButton() {
        return this.exitButton;
    }
        
    public JTextField getSendText() {
        return this.sendText;
    }
    
    public JTextArea getDisplayArea() {
        return this.displayArea;
    }
    public void setSendListener(ActionListener a) {
        sendButton.addActionListener(a);
    }
    
    public void setExitListener(ActionListener a) {
        exitButton.addActionListener(a);
    }
    
    public ChatScreenView() {
        frame = new JFrame("Demo");
        
        /** anonymous inner class to handle window closing events */
	frame.addWindowListener(new WindowAdapter() {
        @Override
	public void windowClosing(WindowEvent evt) {
            System.exit(0);
	} } );
        
        /**
	 * a panel used for placing components
	 */
	JPanel p = new JPanel();

	Border etched = BorderFactory.createEtchedBorder();
        Border titled = BorderFactory.createTitledBorder(etched, "Enter Your Message Here ...");
        p.setBorder(titled);
        
        /**
	 * add the components to the panel
	 */
	p.add(sendText);
	p.add(sendButton);
	p.add(exitButton);

	/**
	 * add the panel to the "south" end of the container
	 */
	frame.getContentPane().add(p,"South");
                
        this.displayArea.setEditable(false);
        this.displayArea.setFont(new Font("SansSerif", Font.PLAIN, 16));
        JScrollPane scrollPane = new JScrollPane(displayArea);
		frame.getContentPane().add(scrollPane,"Center");
                
        frame.pack();
        
        frame.setVisible(true);
	sendText.requestFocus();
    }

     
}
