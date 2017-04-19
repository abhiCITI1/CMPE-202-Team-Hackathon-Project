import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Zip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zip extends Actor
{
    /**
     * Act - do whatever the Zip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String message_zip;
    
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void validateZip()
    {
        
        String zipcode = "97238";
        if(zipcode.startsWith("9"))
        {
            setMessage("Entered zip is a valid Zip");
        }
        else{
            setMessage("Entered zip is not a valid zip");
        }
    }
    
    public void setMessage(String message){
        message_zip = message;
    }
    
    public String getMessage(){
        return message_zip;
    }
}
