package StepsTrainer.Gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

import StepsTrainer.BorderStorage.BorderStorage;
import StepsTrainer.ColorStorage.ColorStorage;
import StepsTrainer.DataStorage.DataStorage;

public class Menu extends JMenuBar {

	public Menu(ColorStorage GetColor, BorderStorage GetBorder)
	{
		this.setPreferredSize(new Dimension(600,30));
		
		this.setForeground(Color.WHITE);
		
			this.setBackground(GetColor.getMenuColor());
			
					this.add(this.getTrybMenu());
					
					this.add(this.getCzasMenu());
					
	}
	
	
	JMenu getTrybMenu(){
		JMenu TrybMenu = new JMenu("Wybierz tryb");
		
		TrybMenu.setForeground(Color.WHITE);
		
		TrybMenu.setFont(new Font ("Verdana", 1, 15));
		
		TrybMenu.getAccessibleContext().setAccessibleDescription("Mo�esz u�y� klawisza 1 aby otworzy� to menu");
		
		TrybMenu.setMnemonic(KeyEvent.VK_1);
		
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
			
				AllBox.setFont(new Font ("Verdana", 1, 10));
					
				TrybMenu.add(AllBox);
				
				return TrybMenu;
		
	}
	
	JMenu getCzasMenu()
	{
		JMenu CzasMenu = new JMenu("Wybierz czas");
		
		CzasMenu.setForeground(Color.WHITE);
		
		CzasMenu.setFont(new Font ("Verdana", 1, 15));
		
			final JTextField TimeAll = new JTextField();
				
			JLabel TimeAllLabel = new JLabel("Czas og�em - w minutach");
			
			 final JTextField TimeStep = new JTextField();
			
			 JLabel TimeStepLabel = new JLabel("Czas na jeden krok - w sekundach");
			
			 	CzasMenu.add(TimeAllLabel);
			 
				CzasMenu.add(TimeAll);
			
				CzasMenu.add(TimeStepLabel);
				
				CzasMenu.add(TimeStep);
				
				CzasMenu.addSeparator();
				
					JButton Save = new JButton("Zapisz czas");
					
					Save.addActionListener(new ActionListener(){

						@Override
						public void actionPerformed(ActionEvent arg0) {
							DataStorage.Time = Integer.parseInt(TimeAll.getText());
							
							DataStorage.StepTime = Integer.parseInt(TimeStep.getText());
						}
						
						
					});
				CzasMenu.add(Save);
				
				return CzasMenu;
		
	}
}
