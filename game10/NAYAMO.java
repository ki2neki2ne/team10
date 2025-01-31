    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class yamano here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class NAYAMO extends Actor
    {
       private int gravity;
        private void checkForJump()
{
    Actor a = getOneIntersectingObject(senntou.class);
    if (a != null) {
         gravity = 20; // this will make the character jump
    }
}      
        /**
         * Act - do whatever the yamano wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        public void act() 
{
    getImage().scale( 155, 220 );
    int x = getX();
    int y = getY();
    int n = 0;
    int l = 0;
    int r = 0;
    int gado = 0;

    int jump = 0;
    int tcnt = 0;
    int count = 0;
    int muteki = 0;
    
    int i=0;
    int m=0;
    int b=0;
   
    if( Greenfoot.isKeyDown( "w" ) ){
        

    
 
    
    Actor actor = getOneIntersectingObject( Hado1.class );
        Actor actor2 = getOneIntersectingObject( Hado2.class );
        Actor actor3 = getOneIntersectingObject( Hado3.class );
        Actor actor4 = getOneIntersectingObject( Hado4.class );
    }
    if( Greenfoot.isKeyDown( "w" ) ){
        if(Greenfoot.isKeyDown( "w" )&&Greenfoot.isKeyDown( "a" ))
        {
            for(i = 0; i<=30; i++){
              setLocation( x-l,y-i*6);
              Greenfoot.delay(1);
              n++;
              l+=2;
            }
            for(m = 0; m<=10; m++){
                setLocation( x-m,y);
            }
            for(b = n; n>=0; n--){
              setLocation( x-l,y-n*6);
              Greenfoot.delay(1);
              l+=2;
            }
        }else if(Greenfoot.isKeyDown( "w" )&&Greenfoot.isKeyDown( "d" ))
        {
            for(i = 0; i<=30; i++){
              setLocation( x+r,y-i*6);
              Greenfoot.delay(1);
              n++;
              r+=2;
            }
            for(m = 0; m<=10; m++){
                setLocation( x+m,y);
            }
            for(b = n; n>=0; n--){
              setLocation( x+r,y-n*6);
              Greenfoot.delay(1);
              r+=2;
            }
        }else if( Greenfoot.isKeyDown( "w" ) ){
            for(i = 0; i<=30; i++){
              setLocation( x,y-i*6);
              Greenfoot.delay(1);
              n++;
            }
            for(b = n; n>=0; n--){
              setLocation( x,y-n*6);
              Greenfoot.delay(1);
            }
        }
    }
    if( Greenfoot.isKeyDown( "a" ) ){
            if(Greenfoot.isKeyDown("a")&&Greenfoot.isKeyDown("s"))
            {
                gado=1;
            }else if( Greenfoot.isKeyDown( "a" ) ){
                move(-4);
            }
    }
    if( Greenfoot.isKeyDown( "d" ) ){
            if(Greenfoot.isKeyDown("d")&&Greenfoot.isKeyDown("s"))
            {
                gado = 1;
            }else if( Greenfoot.isKeyDown( "d" ) ){
                move(4);
            }
    }
    if( Greenfoot.isKeyDown( "s" ) ){
        gado=1;
    }
    

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



