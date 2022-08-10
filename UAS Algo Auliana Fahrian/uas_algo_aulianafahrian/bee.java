import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    /**
     * Act - do whatever the bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        koneksi koneksi = new koneksi();
        String w = koneksi.sampleMethod();
        getWorld().showText("Isi Database = " + w, 120, 30);
        checkKeyPress(w);
        w = String.valueOf(w);
    }
    private void checkKeyPress(String w){
        if (s.equals("w")){
             setLocation(getX(), getY()+5);
        }
        if (s.equals("a")){
             setLocation(getX(), getY()-5);
        }
        if (s.equals("s")){
             setLocation(getX()-5, getY());
        }
        if (s.equals("d")){
             setLocation(getX()+5, getY());
        }
    }
}
