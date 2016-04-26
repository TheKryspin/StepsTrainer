package StepsTrainer.MovesReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import StepsTrainer.DataStorage.DataStorage;

/**
 * 
 */
public class MovesReader {

	ArrayList<String> Moves ;
	
    public MovesReader() {
    	
    	Moves = new ArrayList<String>();
    
    	try {
			this.buildArray();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void buildArray() throws IOException
    {
    	if(DataStorage.Badman==true && DataStorage.All == false && DataStorage.Chill == false){
    		try {
				FileReader Reader = new FileReader("Steps/Badman.txt");
				
				BufferedReader BReader = new BufferedReader(Reader);
				
				String Move = null;
				
				while((Move = BReader.readLine()) != null)
						{
					
						Moves.add(Move);
	
						}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    	}
    	
    	else if(DataStorage.Chill == true && DataStorage.Badman == false && DataStorage.All == false)
    	{
    		try {
				FileReader Reader = new FileReader("Steps/Chill.txt");
				
				BufferedReader BReader = new BufferedReader(Reader);
				
				String Move = null;
				
				while((Move = BReader.readLine()) != null)
						{
					
						Moves.add(Move);
					
						}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    	}else if(DataStorage.All == true && DataStorage.Badman == false && DataStorage.Chill == false)
    	{
    		try {
				FileReader Reader = new FileReader("Steps/All.txt");
				
				BufferedReader BReader = new BufferedReader(Reader);
				
				String Move = null;
				
				while((Move = BReader.readLine()) != null)
						{
					
						Moves.add(Move);
					
						}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    	}
    	
    }
    
    public ArrayList<String> getArray()
    {
    	
    	return Moves;
    }
}