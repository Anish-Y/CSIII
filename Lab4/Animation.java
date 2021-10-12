import mayflower.*;

public class Animation
{

    private int currentFrame;
    private int frameRate;
    private MayflowerImage[] frames;

    
    /**
     * Constructor for objects of class Animation
     */
    public Animation(int fps, String[] s, int scaleW, int scaleH, int trans)
    {
        currentFrame = 0;
        frameRate = fps;
        
        frames = new MayflowerImage[s.length];
        for(int i = 0; i < s.length; i++){
            frames[i] = new MayflowerImage(s[i]);
            frames[i].scale(scaleW, scaleH);
            frames[i].setTransparency(trans);
        }
    }

    public int getFrameRate(){return frameRate;}
    
    public MayflowerImage getNextFrame(){
        MayflowerImage i = frames[currentFrame%10];
        currentFrame++;
        return i;
    }
}
