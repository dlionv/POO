import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tiro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tiro extends Actor
{
    /**
     * Act - do whatever the Tiro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY() - 5);
        
        Actor moeda = getOneIntersectingObject(Moeda.class);
        if (moeda != null)
        {
            Meumundo mundo = (Meumundo) getWorld();
            
            mundo.removeObject(moeda);
            mundo.marcarPonto();
            mundo.removeObject(this);
            return;
        }
        if (getY() < 5)
        {
            getWorld().removeObject(this);
        }
    }
}
