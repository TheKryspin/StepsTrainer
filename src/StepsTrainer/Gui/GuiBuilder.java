package StepsTrainer.Gui;

import java.awt.BorderLayout;
import java.util.*;

import StepsTrainer.BorderStorage.BorderStorage;
import StepsTrainer.ColorStorage.ColorStorage;


public class GuiBuilder {

	private Frame Ramka;
	
	private Panel CenterPanel;
	private Panel BottomPanel;
	
	private TextField MovesField;
	
	private Button StartButton;
	
	private ColorStorage GetColor;
	
	private BorderStorage GetBorder;
	
    public GuiBuilder() {
   
    	GetColor = new ColorStorage();
    	
    	GetBorder = new BorderStorage(GetColor);
    	
    	CenterPanel = new Panel("CenterPanel", GetColor);
    	BottomPanel = new Panel("BottomPanel", GetColor);
    
    		MovesField = new TextField(GetBorder, GetColor);
    		
    			StartButton = new Button(GetColor, GetBorder, "Start");
    
    				Ramka = new Frame();
    }

    public void buildGui()
    {
    	CenterPanel.add(MovesField);
    	
    	BottomPanel.add(StartButton);
    	
    		Ramka.add(CenterPanel, BorderLayout.CENTER);
    		
    		Ramka.add(BottomPanel, BorderLayout.SOUTH);
    	
    		Ramka.setVisible(true);
    	
    	
    }







}