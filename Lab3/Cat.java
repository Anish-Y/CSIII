import mayflower.*;

public class Cat extends Actor
{
    private MayflowerImage[] frames;
    private int currentFrame;
    private Timer animationTimer;
    public Cat()
    {
        animationTimer = new Timer(100000000);
        animationTimer.set(100000);
        currentFrame = 0;
        frames = new MayflowerImage[10];
        for(int i = 0; i < 10; i++){
            frames[i] = new MayflowerImage ("img/cat/Walk ("+(i+1)+").png");
            frames[i].scale(0.3);
        }
        
    }
    
    public void act()
    {
        if( animationTimer.isDone() )
        {
            animationTimer.reset();
            setImage( frames[currentFrame%10] );
            currentFrame++;
        }
    }
}
