package StepsTrainer. ColorStorage;

import java.awt.Color;


/**
 * 
 */
public class ColorStorage {

    private Color CenterPanelLightBlue;
    private Color CenterPanelDarkBlue;

    private Color TextFieldBorderBlue;
    private Color TextFieldFillBlue;

    private Color BottomPanelViolet;
    
    private Color ButtonBorderViolet;
    private Color ButtonFillViolet;
    
    public ColorStorage() {
    
    	CenterPanelLightBlue = new Color(23, 133, 187);
    	CenterPanelDarkBlue = new Color(63, 94, 145);
    	
    	TextFieldBorderBlue = new Color(13,73,102);
    	TextFieldFillBlue = new Color(45, 145, 193);
    	
    	BottomPanelViolet = new Color(123, 35, 83);
    	
    	ButtonFillViolet = new Color(145, 72, 112);
    	ButtonBorderViolet= new Color(91, 26, 61);
    }

    
    public Color getCenterPanelLightBlue() {
        
        return CenterPanelLightBlue;
    }

  
    public Color getCenterPanelDarkBlue() {
        
        return CenterPanelDarkBlue;
    }

    /**
     * @return
     */
    public Color getTextFieldBorderBlue() {
        // TODO implement here
        return TextFieldBorderBlue;
    }

   public Color getTextFieldFillBlue()
   {
	 return  TextFieldFillBlue;
	   
   }
    public Color getBottomPanelViolet() {
        // TODO implement here
        return BottomPanelViolet;
    }

    /**
     * @return
     */
    public Color getButtonBorderViolet() {
        // TODO implement here
        return ButtonBorderViolet;
    }

    /**
     * @return
     */
    public Color getButtonFillViolet() {
        // TODO implement here
        return ButtonFillViolet;
    }

}