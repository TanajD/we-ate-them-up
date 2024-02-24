import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main { 
	public static void main(String [] args) {
		

	{
		SwingUtilities.invokeLater(() -> {
    		Ui Ui = new Ui();
    		Navigation.currentLocation = 0;
    		JFrame visualFrame = Ui.visuals();
    	
    		//JFrame buttonFrame = Ui.createButtonFrame();
    		
    		
    		
    	});


	
//Print player inventory
		Inventory.printInventory();
		
//Print player updated inventory
        //System.out.println("Inventory:" +  "Inventory");
			
	
	
	//Navigation Class
    Navigation navigation = new Navigation();
   // String leftOption = navigation.goLeft(navigation.currentLocation);
   // String rightOption = navigation.goRight(navigation.currentLocation);
   
    //Print navigation path
  //  System.out.println("Left Path:" +  leftOption);
   // System.out.println("Right Path:" +  rightOption);
         

//Location Class
       Location planeCrashSite = new Location();
       Location jungle = new Location();
       Location cave = new Location();
       Location village = new Location();
       Location river = new Location();
       Location beach = new Location();

       //navigation&exits
       planeCrashSite.setExit(0, jungle);
       jungle.setExit(0, cave);
       jungle.setExit(1, village);
       cave.setExit(0, jungle);
       village.setExit(0,jungle);
       river.setExit(0, beach);
       
//Ending Class
       Ending end = new Ending();

         
    		   
   	}
}
}
