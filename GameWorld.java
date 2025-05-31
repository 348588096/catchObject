import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    public GameWorld()
    {    
        super(600, 400, 1); 
        setBackground("images/background.jpg");
        
        Mario mario = new Mario();
        addObject(mario,getWidth()/2,getHeight()-20);
    }
}
