package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    //does output.
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
       
        String lastName = "";
        
        boolean nameIsCorrect = true;
        //For the record:
        //added the try block after class started. 
    do{
        
        try{ 
        String fullName = JOptionPane.showInputDialog("Enter full name: In the Format: First Last.");
        lastName = nameService.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
        }catch(IllegalArgumentException iae){
              JOptionPane.showMessageDialog(null, iae.getMessage()); 
              nameIsCorrect = false;
        }
        
    }while(!nameIsCorrect);
        
    }
     
}
