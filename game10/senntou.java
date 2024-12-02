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
        super(1200, 676, 1); 
        addObject(new NAYAMO(),1100,530);
        addObject(new TAINAN(),100,530);
        addObject( new Life(), 1000 , 50 );
        
    }
}
