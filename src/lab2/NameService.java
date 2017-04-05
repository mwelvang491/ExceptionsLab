package lab2;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService{
   
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     * @throws IllegalArgumentException if fullName is null or empty or has 
     * fewer than two parts
     */
    String illegalArgumentMessage="Illegal Argument Exception";
    
    
    public String extractLastName(String fullName) throws IllegalArgumentException {
        String lastName = null;
       
        if(fullName.isEmpty() || fullName == null){
            
            setIllegalArgumentMessage("Must Enter A Full Name Before Submitting");
            throw new IllegalArgumentException( getIllegalArgumentMessage() );
        }
        String[] parts = fullName.split(" ");
        
        if(parts.length <= 1 ){
            
          setIllegalArgumentMessage("Must Enter A First and Last Name Seperated With A Space.");
          throw new IllegalArgumentException(getIllegalArgumentMessage());  
        }
        
        
         lastName = parts[parts.length - 1];
        // write your code here to extract the lastName and store in the
        // above local variable
        
        return lastName;
    }

    public String getIllegalArgumentMessage() {
        return illegalArgumentMessage;
    }

    public void setIllegalArgumentMessage(String illegalArgumentMessage) {
        this.illegalArgumentMessage = illegalArgumentMessage;
    }
    

    
    
}
