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


         super(1200, 676, 1); 
         
         World over = new Gameover();


    
        
        addObject( new Life(), 750 , 50 );//一番左
        addObject( new Life2(), 850 , 50 );
        addObject( new Life3(), 950 , 50 );
        addObject( new Life4(), 1050 , 50 );
        addObject( new Life5(), 1150 , 50 );//一番右

        

        
        addObject(new NAYAMO(),1100,530);
        addObject(new TAINAN(),100,530);


        // Create a new world with 600x400 cells with a cell size of 1x1 pixels
        if( Greenfoot.isKeyDown("enter") )
        {
             Greenfoot.setWorld( over );
        }

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.


    }
}
