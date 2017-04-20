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
    public void act() 
    {
        // Add your action code here.
        World w=getWorld();
        
    } 
    
    public void setMessageString(String msg)
    {
        //Message message = new Message("Welcome to the gas pump station");
        //message = new Message(msg);
        World w=getWorld();
        //message.showMessage(w, message);
        //w.addObject(message,721, 154);
        //message.setLocation(721, 154);
        
        String imageFile = "";
        
        state = msg;
        
        //greenfootImage = new GreenfootImage("/Users/Abhishek/CMPE202---Team-Hackathon-Project/gaspump/images/zipValidated.png");
        
        
        //GreenfootImage greenfootImage1 = new GreenfootImage(greenfootImage);
        
        //message.clear();
        
        //message.setImage(greenfootImage1);
        ///getWorld().addObject(message,700,160);
        
        
        
        screenimage = new GreenfootImage(350,50);
         setImage(screenimage);
         screenimage.clear();
         screenimage.setColor(Color.WHITE);
         screenimage.fill();
         screenimage.setColor(Color.BLACK);
         screenimage.drawString("Please enter zip code",0,25);
         getWorld().addObject(message,700,160);
        //setImage(greenfootImage);
        
        if(state.equals("Card Validated"))
        {
            message = new Message("Please enter zip code");
        
        }
        if(state.equals("CardNotInserted"))
        {
            message = new Message("Please Scan your Card Again");
            getWorld().addObject(message,700,160);
        }
        if(state.equals("ZipValidated"))
        {
            message = new Message("Proceed with your selection");
            
           // message.setImage(greenfootImage);
            
            getWorld().addObject(message,700,160);
        }
        if(state.equals("Fake card"))
        {
            message = new Message("Fake Card.. Can't Process);
            getWorld().addObject(message,700,160);
        }
    }
}
