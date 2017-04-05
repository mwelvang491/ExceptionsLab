/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author mitchell
 */
public class MandatoryStringException 
        extends IllegalArgumentException { //Unchecked. Thats okay this probably wont Kill Anyone. "Probably"
    
    private final static String msg = "Method Argument Is Mandatory";
    
    public MandatoryStringException() {
        super(msg);
    }

    public MandatoryStringException(String s) {
        super(msg);
    }

    public MandatoryStringException(String message, Throwable cause) {
        super(msg, cause);
    }

    public MandatoryStringException(Throwable cause) {
        super(cause);
    }
                                       
        
    
}
