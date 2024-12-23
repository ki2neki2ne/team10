import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hado1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hado1 extends Actor
{
    /**
     * Act - do whatever the Hado1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer = 100;
    private int flag_tama = 0;
    
    public Hado1()
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
