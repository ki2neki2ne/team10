import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class senntou here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class senntou extends World
{

    private int spone1=200;
    private int spone2=300;
    private int spone3=400;
    private int spone4=500;
    
    private int x = Greenfoot.getRandomNumber(100);
    
    public senntou()
    {    

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.


         super(1200, 676, 1); 
         int x = Greenfoot.getRandomNumber(600);
         
         World over = new Gameover();


    

        addObject(new NAYAMO(),530,260);
        
        addObject( new Test_senni(), 400 , 50 );
        
        addObject( new Life(), 750 , 50 );//一番左
        addObject( new Life2(), 850 , 50 );
        addObject( new Life3(), 950 , 50 );
        addObject( new Life4(), 1050 , 50 );
        addObject( new Life5(), 1150 , 50 );//一番右

        

        
        addObject(new NAYAMO(),1100,530);
        addObject(new TAINAN(),100,530);
        
     
       
        
       
        if( Greenfoot.isKeyDown("enter") )
        {
             Greenfoot.setWorld( over );
        }
        
        

     

    }
     public void act()
      {
          spone1--;
          spone2--;
          spone3--;
          spone4--;
          
          if(spone1==0)
         {
             x = Greenfoot.getRandomNumber(100);
             if(x<25)  addObject(new Hado1(),300,200);
             spone1=200;
  
            }
            if(spone2==0)
         {
             x = Greenfoot.getRandomNumber(100);
             if(x<50)  addObject(new Hado2(),300,300);
             spone2=300;
            }
            if(spone3==0)
         {
             x = Greenfoot.getRandomNumber(100);
             if(x<75)  addObject(new Hado3(),300,400);
             spone3=400;
            }
            if(spone4==0)
         {
             x = Greenfoot.getRandomNumber(100);
             if(x<100)  addObject(new Hado4(),300,500);
             spone4=500;
            }
          
        }

    
    
}
