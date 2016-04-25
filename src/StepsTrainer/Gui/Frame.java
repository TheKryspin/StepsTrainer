package StepsTrainer.Gui;

import java.awt.BorderLayout;
import java.awt.Dimension;


import javax.swing.JFrame;

/**
 * 
 */
public class Frame extends JFrame{


    /**
	 * 
	 */
	private static final long serialVersionUID = -1470315497995974293L;

	public Frame() {
    
    super();
    	
    this.setSize(new Dimension(600,530));
    
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    	BorderLayout Layout = new BorderLayout();
    	
    	this.setLayout(Layout);
    
    		this.setName("Steps Trainer By TheKryspin");	
    		
    			this.setResizable(false);
   
    	
    }



}