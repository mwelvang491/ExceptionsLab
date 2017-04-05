package lab0;

/**
 * In this challenge you need to address the probability that at some point the
 * arguments to method parameters may not be valid.
 * <p>
 * For example, String arguments may be null or empty; other objects may be
 * null; or primitive numbers may be out of acceptable range.
 * <p>
 * You need to validate ALL method parameters to make sure any and all arguments
 * are valid. The only exception is when any argument is acceptable based on
 * requirements. Fix the code below using if logic to validate method arguments
 * and throw IllegalArgumentException if the validation fails.
 *
 * @author Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_VACATION_DAYS = 0;
    private String firstName; //any length as long as its not empty or null. 
    private String lastName;  
    private String ssn;
    private int daysVacation;

    public Employee() {
        // initialize a bunch of default values
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        daysVacation = 0;
    }

    /**
     * Convenience constructor to set all properties.
     * @param firstName - cannot be null or empty
     * @param lastName - cannot be null or empty
     * @param ssn
     * @param daysVacation
     * @throws IllegalArgumentException if parameters are not valid
     */
    public Employee(String firstName, String lastName, String ssn, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setDaysVacation(daysVacation);
    }

    public final int getDaysVacation() {
        return daysVacation;
    }
    //Must be between 0-28. 
    
    public final void setDaysVacation(int daysVacation) throws IllegalArgumentException {
        if(daysVacation < MIN_VACATION_DAYS || daysVacation > MAX_VACATION_DAYS){
            throw new IllegalArgumentException("Vaction cannot be more than "  + MAX_VACATION_DAYS 
                    + "or Less Than " + MIN_VACATION_DAYS);
        }else{
        this.daysVacation = daysVacation;  
        }
       
    }

    public final String getFirstName() {
        return firstName;
    }

    /**
     * Mutates the first name.
     * @param firstName - cannot be null or empty
     * @throws IllegalArgumentException if firstName is null or empty
     */
    public final void setFirstName(String firstName) throws IllegalArgumentException {
        if(firstName == null || firstName.isEmpty()) {
            throw new IllegalArgumentException("Sorry, First name is mandatory. Please try again");
        }
        this.firstName = firstName;
    }

    public final String getLastName() {
        return lastName;
    }

    /**
     * Mutates the lastName.
     * @param lastName - cannot be null or empty
     * @throws IllegalArgumentException if lastName is null or empty
     */
    public final void setLastName(String lastName) throws IllegalArgumentException {
        if(lastName == null || lastName.isEmpty()) {
            throw new IllegalArgumentException("Sorry, Last Name is mandatory. Please try again");
        }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) throws IllegalArgumentException {
        // add validation for homework.
        
        if(ssn == null || ssn.isEmpty() ){
          throw new IllegalArgumentException("Social Security Number is mandatory."); 
        }else {
            if(ssn.length() == 9 || ssn.length() == 11){
              //Check for hypens Either Way.     
                
               
              
              
              
                
            } else{
               throw new IllegalArgumentException("Please Enter "
              + "A 9 digit SSN Without Hypens. Or an 11 digit SSN With Hypens.");   
            }  
        }
        this.ssn = ssn;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
