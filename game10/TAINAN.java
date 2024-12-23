import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TAINAN here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TAINAN extends Actor
{
    /**
     * Act - do whatever the TAINAN wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
            if( Greenfoot.isKeyDown( "right" ) ){
                setRotation(0);
                move(20);
            }
            if( Greenfoot.isKeyDown( "left" ) ){
                setRotation(180);
                move(20);
            }
            if( Greenfoot.isKeyDown( "up" ) ){
                setRotation(90);
                move(5);
            }
            if( Greenfoot.isKeyDown( "down" ) ){
                setRotation(270);
                move(5);
            }
    }    
}
