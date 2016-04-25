package StepsTrainer.Gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;

import StepsTrainer.ColorStorage.ColorStorage;

/**
 * 
 */
public class Panel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5411729345132111150L;

	String Name;
    
    ColorStorage GetColor;
    
    public Panel(String name, ColorStorage GetColor) {
    	
    	super();
    	
    	this.Name = name;
    	
    	this.GetColor = GetColor;
    	if(name == "CenterPanel"){
    	
    		this.setPreferredSize(new Dimension(600,417));
    		
    			FlowLayout Layout = new FlowLayout();
    			
    			Layout.setVgap(87);
    			
    				this.setLayout(Layout);
    	
    	}else if(name == "BottomPanel")
    	{
    		this.setPreferredSize(new Dimension(600,83));
        		
    		FlowLayout Layout = new FlowLayout();
    		
    				Layout.setVgap(20);
			
					this.setLayout(Layout);
    	}
    	
    }

    @Override
    public void paintComponent(Graphics g)
    {
    	if(Name == "CenterPanel"){
        	
    		g.setColor(GetColor.getCenterPanelLightBlue());
    		
    			g.fillRect(0, 	0, 	600, 	208);
    		
    		g.setColor(GetColor.getCenterPanelDarkBlue());
    		
    			g.fillRect(0,	208,	600 , 417);
    		
    	}else if(Name == "BottomPanel")
    	{
    		g.setColor(GetColor.getBottomPanelViolet());
    		
    			g.fillRect(0, 	0, 	600, 	83);
    			
    	}
    
    	
    }

}