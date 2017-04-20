import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CardSlot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CardSlot extends Actor
{
    /**
     * Act - do whatever the CardSlot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    boolean isRightCardInserted;
    public CardSlot()
    {
        GreenfootImage image = getImage() ;
        image.scale( 150, 180 ) ; 
    }
    
    public void act() 
    {
        // Add your action code here.
        int mouseCordinateX, mouseCordinateY;
         
         if(hasCollisionOccured(FakeCard.class))
     {
         isRightCardInserted=false;
         DisplayScreen msg = new setMessageString("Fake card");
          
     }
     else if(hasCollisionOccured(ValidCard.class))
     {
         isRightCardInserted=true;
         DisplayScreen msg = new setMessageString("Card Validated");
        
     }
     else if(hasCollisionOccured(MembershipCard.class))
     {
         isRightCardInserted=true;
         DisplayScreen msg = new setMessageString("Card Validated");
         
         
     }
       
    }    
    
    public boolean hasCollisionOccured(Class CollidingClass)
    {
        Actor actor = getOneObjectAtOffset(10, 10, CollidingClass);
        if(actor !=null )  
        {
            getWorld().removeObject(actor);  
            return true;
        }
        else
            return false;
    }
    
    public boolean hasRightCard()
    {
        return isRightCardInserted;
    }    
}
