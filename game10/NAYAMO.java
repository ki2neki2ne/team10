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
        public void act() 
{
    getImage().scale( 155, 220 );
    int x = getX();
    int y = getY();
    int n = 0;
    int l = 0;
    int r = 0;
    if( Greenfoot.isKeyDown( "w" ) ){
        if(Greenfoot.isKeyDown( "w" )&&Greenfoot.isKeyDown( "a" ))
        {
            for(int i = 0; i<=30; i++){
              setLocation( x-l,y-i*6);
              Greenfoot.delay(1);
              n++;
              l+=2;
            }
            for(int m = 0; m<=10; m++){
                setLocation( x-m,y);
            }
            for(int b = n; n>=0; n--){
              setLocation( x-l,y-n*6);
              Greenfoot.delay(1);
              l+=2;
            }
        }else if(Greenfoot.isKeyDown( "w" )&&Greenfoot.isKeyDown( "d" ))
        {
            for(int i = 0; i<=30; i++){
              setLocation( x+r,y-i*6);
              Greenfoot.delay(1);
              n++;
              r+=2;
            }
            for(int m = 0; m<=10; m++){
                setLocation( x+m,y);
            }
            for(int b = n; n>=0; n--){
              setLocation( x+r,y-n*6);
              Greenfoot.delay(1);
              r+=2;
            }
        }else if( Greenfoot.isKeyDown( "w" ) ){
            for(int i = 0; i<=30; i++){
              setLocation( x,y-i*6);
              Greenfoot.delay(1);
              n++;
            }
            for(int b = n; n>=0; n--){
              setLocation( x,y-n*6);
              Greenfoot.delay(1);
            }
        }
    }
    if( Greenfoot.isKeyDown( "a" ) ){
            move(-4);
    }
    if( Greenfoot.isKeyDown( "d" ) ){
            move(4);
    }
    if( Greenfoot.isKeyDown( "s" ) ){
    }
}
}

