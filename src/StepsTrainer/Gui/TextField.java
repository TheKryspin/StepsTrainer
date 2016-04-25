package StepsTrainer.Gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;

import StepsTrainer.BorderStorage.BorderStorage;
import StepsTrainer.ColorStorage.ColorStorage;

/**
 * 
 */
public class TextField extends JTextField {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6366272645980045607L;

	private BorderStorage GetBorder;
	
	private ColorStorage GetColor;
    
    public TextField(BorderStorage GetBorder, ColorStorage GetColor) {
   
    	this.GetBorder = GetBorder;
    	
    	this.GetColor = GetColor;
    		
    		this.setPreferredSize(new Dimension( 568, 245 ));
    		
    	this.setBackground(GetColor.getTextFieldFillBlue());
    	
    	this.setBorder(GetBorder.getTextFieldBorderBlue());
    	
    		this.setForeground(Color.WHITE);
    	
    		this.setHorizontalAlignment(CENTER);
    			
    		this.setFont(new Font("Verdana", 1, 50));
    	
    }

    

}