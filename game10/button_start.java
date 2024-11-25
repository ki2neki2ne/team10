import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class button_start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class button_start extends Actor
{
    /**
     * Act - do whatever the button_start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().addObject( new button_start(), 300, 200 );
    }    
}
