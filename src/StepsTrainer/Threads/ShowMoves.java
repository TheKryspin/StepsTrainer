package StepsTrainer.Threads;

import java.util.*;

import StepsTrainer.DataStorage.DataStorage;
import StepsTrainer.Gui.GuiBuilder;
import StepsTrainer.MovesReader.MovesReader;

/**
 * 
 */
public class ShowMoves extends Thread {
	 private ArrayList<String> Moves;
   
	 private MovesReader MovesToRead;
	 
	 private GuiBuilder Builder;
    
	 public ShowMoves(GuiBuilder Builder) {
    	MovesToRead = new MovesReader();
    	
    	Moves = MovesToRead.getArray();
    
    	this.Builder = Builder;
    }

    
   public void run()
   {
	   int StepTime = DataStorage.StepTime;
	   int CurrentTime = 0;
	   int TimeAll = DataStorage.Time;
	   int Choice = 0;
	   
	   while(CurrentTime < TimeAll*60){
		   
		   try {
			Thread.sleep(DataStorage.StepTime*1000);
			
			 Choice = (int) (Math.random()*Moves.size());
			 
			 Builder.getMovesTextField().setText(Moves.get(Choice));
			 
			 CurrentTime += StepTime;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		 
		   
		   
		   
	   }
   }



}