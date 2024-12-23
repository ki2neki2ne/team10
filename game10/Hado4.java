import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hado4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hado4 extends Actor
{
    
    
    public Hado4()
    {
        getImage().scale( 40, 40 );
    }
    public void act() 
    {
         move(4);
         
         if( isAtEdge() ){
             senntou.counter++;
             getWorld().removeObject( this );
            }
    }    
}
