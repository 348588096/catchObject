import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Mario extends Actor
{
    private int velocityY = 0;
    private int gravity = 1;
    private boolean onGround = true;

    public void Mario()
    {
        setImage("images/mario.png");
    }
    
    public void act()
    {
        moveLeftRight();
        jump();
        fall();
    }

    public void moveLeftRight()
    {
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 4, getY());
        }
    }

    public void jump()
    {
        if (Greenfoot.isKeyDown("space") && onGround)
        {
            velocityY = -15;   // Jump strength
            onGround = false;
        }
    }

    public void fall()
    {
        setLocation(getX(), getY() + velocityY);
        velocityY += gravity;

        if (getY() >= 300)  // Set this to your ground level
        {
            setLocation(getX(), 300);
            velocityY = 0;
            onGround = true;
        }
    }
}
