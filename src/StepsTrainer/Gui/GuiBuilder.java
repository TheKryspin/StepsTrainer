package StepsTrainer.Gui;

import java.awt.BorderLayout;

import StepTrainer.Listener.StartListener;
import StepsTrainer.BorderStorage.BorderStorage;
import StepsTrainer.ColorStorage.ColorStorage;
import StepsTrainer.DataStorage.DataStorage;
import StepsTrainer.Threads.ShowMoves;


public class GuiBuilder {

	private Frame Ramka;
	
	private Panel CenterPanel;
	private Panel BottomPanel;
	
	private TextField MovesField;
	
	private Button StartButton;
	
	private ColorStorage GetColor;
	
	private BorderStorage GetBorder;
	
	private Menu OptionMenu;
	
	
	
    public GuiBuilder() {
   
    	GetColor = new ColorStorage();
    	
    	GetBorder = new BorderStorage(GetColor);
    	
    	CenterPanel = new Panel("CenterPanel", GetColor);
    	BottomPanel = new Panel("BottomPanel", GetColor);
    
    		MovesField = new TextField(GetBorder, GetColor);
    		
    		
    			StartButton = new Button(GetColor, GetBorder, "Start");
    			
    				DataStorage.Referencja = MovesField;
    				
    				StartListener Start = new StartListener(this);
    				
    				StartButton.addMouseListener(Start);
    
    			OptionMenu = new Menu(GetColor, GetBorder);
    			
    				Ramka = new Frame();
    }

    public void buildGui()
    {
    	CenterPanel.add(MovesField);
    	
    	BottomPanel.add(StartButton);
    	
    		Ramka.add(OptionMenu, BorderLayout.NORTH);
    	
    		Ramka.add(CenterPanel, BorderLayout.CENTER);
    		
    		Ramka.add(BottomPanel, BorderLayout.SOUTH);
    	
    		Ramka.setVisible(true);
    	
    	
    }


    public TextField getMovesTextField(){ return MovesField; }




}