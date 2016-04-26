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
    
	  int StepTime = DataStorage.StepTime;
	  int CurrentTime = 0;
	  int TimeAll = DataStorage.Time*60;
	  int Choice = 0;
	 
	 
	 public ShowMoves(GuiBuilder Builder) {
    	MovesToRead = new MovesReader();
    	
    	Moves = MovesToRead.getArray();
    
    	this.Builder = Builder;
    }

   @Override 
   public void run()
   {
   
	   while(this.CurrentTime < this.TimeAll){
		     
		   this.setMove();
		   
		   this.CurrentTime += this.StepTime;
		   
		  try {
			Thread.sleep(StepTime*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
   
   }

public void setMove()
{
	 Choice = (int) (Math.random()*Moves.size());

	 Builder.getMovesTextField().setText(Moves.get(Choice));
}
}