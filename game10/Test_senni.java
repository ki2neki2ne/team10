import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Test_senni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test_senni extends Actor
{
    
    //これは戦闘画面からゲームオーバー画面に遷移するためのテスト用ボタンです
    //実装時には消す必要があります。
    
    public void act() 
    {
        World over = new Gameover();
         if( Greenfoot.isKeyDown("space") )
        {
            
             Greenfoot.setWorld( over );
        }
    }    
}
