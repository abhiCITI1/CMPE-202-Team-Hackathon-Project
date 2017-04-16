import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1); 
        prepare();
    }
    
    public void prepare()
    {
        addObject(new Keypad(), 723, 416);
        addObject( new SidebarButtons(), 554, 164 ) ;
        addObject( new SidebarButtons(), 887, 165 ) ;
        addObject( new ValidCard(), 151, 101 ) ;
        addObject( new MembershipCard(), 159, 312 ) ;
        addObject( new FakeCard(), 153, 525 ) ;
        addObject( new Nozzle(), 1062, 254 ) ;
    
    }
}
