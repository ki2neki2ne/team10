import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hado2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hado2 extends Actor
{


    public Hado2()
    {
        getImage().scale( 40, 40 );
    }
    public void act() 
    {
        Actor actor = getOneIntersectingObject( NAYAMO.class );
         move(4);
         
         if( isAtEdge() ){
             senntou.counter++;
             getWorld().removeObject( this );
            }
            if( actor != null ){
         // TARO とぶつかった時の処理を書く
         senntou.Lcounter--;
         getWorld().removeObject( this );
            }  
    }    
}
