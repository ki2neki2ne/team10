import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class yamano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NAYAMO extends Actor
{
    /**
     * Act - do whatever the yamano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    int muteki = 0;

    public void act() 
    {
        if(muteki > 0){
            muteki--;
            if( muteki == 0) getImage().setTransparency(255);
        }
        

        getWorld().showText( "count = "+count , 100, 50 );
        getWorld().showText( "muteki = "+muteki , 100, 100 );

        Actor actor = getOneIntersectingObject( Hado1.class );
        if( actor != null && muteki == 0){
            count++;
            muteki = 100;
            getImage().setTransparency(120);
        }
        
        Actor actor2 = getOneIntersectingObject( Hado2.class );
        if( actor2 != null && muteki == 0){
            count++;
            muteki = 100;
            getImage().setTransparency(120);
        }
        
        Actor actor3 = getOneIntersectingObject( Hado3.class );
        if( actor3 != null && muteki == 0){
            count++;
            muteki = 100;
            getImage().setTransparency(120);
        }
        
        Actor actor4 = getOneIntersectingObject( Hado4.class );
        if( actor4 != null && muteki == 0){
            count++;
            muteki = 100;
            getImage().setTransparency(120);
        }

    }    

}
