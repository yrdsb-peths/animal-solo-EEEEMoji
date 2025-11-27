import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The elephant, our hero
 * 
 * @author Ethan 
 * @version November 2025
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }else if (Greenfoot.isKeyDown("right")){
            move(1);                
        }
    }
}
