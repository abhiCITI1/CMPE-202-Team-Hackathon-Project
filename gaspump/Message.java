import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Message here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Message extends Actor
{
    private GreenfootImage screenimage;
    /**
     * Act - do whatever the Message wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Message(String msg)
    {
       
         screenimage = new GreenfootImage(250,50);
         setImage(screenimage);
         screenimage.clear();
         screenimage.setColor(Color.WHITE);
         screenimage.fill();
         screenimage.setColor(Color.BLACK);
         screenimage.drawString(msg,0,25);
    }
    public Message()
    {
       
   
    }
    public void act() 
    {
        // Add your action code here.
    }    
    public void showMessage(Message msg, World w)
    {
       World thisWorld = w;
        //Instruction inst = new Instruction();
       Message message= msg;
       w.addObject(message,740, 200);
       message.setLocation(722, 154);
       
    }
}
