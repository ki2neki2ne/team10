import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Button_Result extends Actor
{
     
   
    public void act() 
    {
        MouseInfo minfo = Greenfoot.getMouseInfo();
         World result = new Result();
         
          int x0 = getX();
         int y0 = getY();

         int w = getImage().getWidth();
         int h = getImage().getHeight();
         
         int flag=1;
         
         int x;
         int y;
         
         int button;
         
        ((Gameover)getWorld()).showTextEx("スコアを表示", x0-13, y0, 56, false, Color.CYAN );
        
         if( minfo != null ){

            // マウス座標取得
            x = minfo.getX();
            y = minfo.getY();
            
            
            // マウスボタンのクリック時に押したボタン番号を取得
            // クリックした時だけ数値が入る。押しっぱなしの時やボタンを離した時は 0 になるので注意
            button = minfo.getButton();
            if( button != 0 ){
                if((x>=x0-w/2&&x<=x0+w/2)&&(y>=y0-h/2&&y<=y0+h/2))
                {
                    flag=0;
                    Greenfoot.setWorld( result );
                    
                }
                
            }
        }
    }    
}
