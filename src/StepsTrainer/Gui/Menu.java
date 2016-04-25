package StepsTrainer.Gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import StepsTrainer.BorderStorage.BorderStorage;
import StepsTrainer.ColorStorage.ColorStorage;
import StepsTrainer.DataStorage.DataStorage;

public class Menu extends JMenuBar {

	public Menu(ColorStorage GetColor, BorderStorage GetBorder)
	{
		this.setPreferredSize(new Dimension(600,30));
		
		this.setForeground(Color.WHITE);
		
			this.setBackground(GetColor.getMenuColor());
			
			JMenu TrybMenu = new JMenu("Wybierz tryb");
			
				TrybMenu.setForeground(Color.WHITE);
				
				TrybMenu.setFont(new Font ("Verdana", 1, 15));
				
				TrybMenu.setBackground(GetColor.getMenuColor());
				
					JCheckBoxMenuItem BadmanBox = new JCheckBoxMenuItem("Badman");
						BadmanBox.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent arg0) {
							
								if(DataStorage.Badman = false)DataStorage.Badman = true;
								else DataStorage.Badman  = false;
							}
						
							});
						
							BadmanBox.setFont(new Font ("Verdana", 1, 10));
							
						TrybMenu.add(BadmanBox);
					
						JCheckBoxMenuItem ChillBox = new JCheckBoxMenuItem("Chill");
						ChillBox.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent arg0) {
							
								if(DataStorage.Chill = false)DataStorage.Chill = true;
								else DataStorage.Chill  = false;
							}
						
							});
					
							ChillBox.setFont(new Font ("Verdana", 1, 10));
						
							TrybMenu.add(ChillBox);
	
	
						JCheckBoxMenuItem AllBox = new JCheckBoxMenuItem("All");
						AllBox.addActionListener(new ActionListener(){

							@Override
							public void actionPerformed(ActionEvent arg0) {
							
								if(DataStorage.All = false)DataStorage.All = true;
								else DataStorage.All  = false;
							}
						
							});
					
						TrybMenu.add(AllBox);
					
					this.add(TrybMenu);
	}
	
	
}
