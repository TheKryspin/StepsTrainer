package StepsTrainer.BorderStorage;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

import StepsTrainer.ColorStorage.ColorStorage;

/**
 * 
 */
public class BorderStorage {

	private Border TextFieldBorderBlue;

    private Border ButtonBorderViolet;
  
	
    public BorderStorage(ColorStorage GetColor) {
   
    	TextFieldBorderBlue = BorderFactory.createLineBorder(GetColor.getTextFieldBorderBlue(), 6);
    	
    	ButtonBorderViolet = BorderFactory.createLineBorder(GetColor.getButtonBorderViolet(), 6);
    }


    public Border getTextFieldBorderBlue() {
        
        return TextFieldBorderBlue;
    }

   
    public Border getButtonBorderViolet() {
       
        return ButtonBorderViolet;
    }

}