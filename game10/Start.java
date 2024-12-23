import greenfoot.*;  
/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int w = getImage().getWidth();
    int h = getImage().getHeight();
    //Actor start = getOneIntersectingObject( Start.class );
    public void act() 
    {
         MouseInfo minfo = Greenfoot.getMouseInfo();
         
         int x0 = getX();
         int y0 = getY();

         int w = getImage().getWidth();
         int h = getImage().getHeight();
         
         int flag_senntou = 0;
         
         
         World game = new senntou();
         
        if( minfo != null ){

            // マウス座標取得
            int x = minfo.getX();
            int y = minfo.getY();
            
            
            // マウスボタンのクリック時に押したボタン番号を取得
            // クリックした時だけ数値が入る。押しっぱなしの時やボタンを離した時は 0 になるので注意
            int button = minfo.getButton();
            if( button != 0 ){
                if((x>=x0-w/2&&x<=x0+w/2)&&(y>=y0-h/2&&y<=y0+h/2))
                {
                    
                    Greenfoot.setWorld( game );
                }
                
            }
        }
       if( Greenfoot.isKeyDown("enter") )
        {
            flag_senntou = 1;
             Greenfoot.setWorld( game );
        }
    }    
}
