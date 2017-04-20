import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DisplayScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayScreen extends Actor
{
    
    /**
     * Act - do whatever the DisplayScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String state = "";
    private GreenfootImage currentScreenImage= null;
    private Message message = null;
    
    public void act() 
    {
        // Add your action code here.
        World w=getWorld();
        currentScreenImage = getImage();
        
        //setMessageString("CardValidated");
        //setMessageString("CardNotInserted");
        
    } 
    
    public void setMessageString(String msg)
    {
        
        World w=getWorld();
        System.out.println(msg);
        
        state = msg;
        
        
        
        //currentScreenImage = new GreenfootImage(msg,250, Color.WHITE, Color.BLACK);
        //setImage(new GreenfootImage(msg,40, Color.BLACK, Color.WHITE));
        //w.addObject(_object_, _x_, _y_)
    
    
        
       
        
        if(state.equals("Card Validated"))
        {
            setImage(new GreenfootImage(msg,40, Color.BLACK, Color.WHITE));
           
        }
        else if(state.equals("Fake"))
        {
            System.out.println("inside" +msg);
        
            getImage().clear();
            setImage(new GreenfootImage(msg,30, Color.BLACK, Color.WHITE));
        }
        
        else 
        {
            getImage().clear();
            setImage(new GreenfootImage(msg,30, Color.BLACK, Color.WHITE));

        }
        
        if(state.equals("Zip Validated"))
        {
            getImage().clear();
            setImage(new GreenfootImage(msg,40, Color.BLACK, Color.WHITE));
           
        }
       else
        {
            getImage().clear();
            setImage(new GreenfootImage(msg,30, Color.BLACK, Color.WHITE));

        }
        
    }
}
