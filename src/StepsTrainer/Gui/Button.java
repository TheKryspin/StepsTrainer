package StepsTrainer.Gui;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;

import StepsTrainer.BorderStorage.BorderStorage;
import StepsTrainer.ColorStorage.ColorStorage;

/**
 * 
 */
public class Button extends JButton {

   
	private ColorStorage GetColor;
	
	private BorderStorage GetBorder;
   
	private static final long serialVersionUID = -2023358756433629744L;

	public Button(ColorStorage GetColor, BorderStorage GetBorder, String Name) {
		
		super();
		
		this.GetColor = GetColor;
		
		this.GetBorder = GetBorder;

			this.setPreferredSize(new Dimension(156, 54));
		
			this.setBackground(GetColor.getButtonFillViolet());
			
				this.setBorder(GetBorder.getButtonBorderViolet());
				
					this.setForeground(Color.WHITE);
					
					this.setFont(new Font("Verdana", 1, 20));
					
						this.setText(Name);
    }


}