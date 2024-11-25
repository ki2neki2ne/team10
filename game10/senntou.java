import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class senntou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class senntou extends World
{

    /**
     * Constructor for objects of class senntou.
     * 
     */
    public senntou()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new NAYAMO(),530,260);
        
        addObject( new Life(), 1000 , 50 );
    }
}
