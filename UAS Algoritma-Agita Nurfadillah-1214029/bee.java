import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.*;

/**
 * Write a description of class bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bee extends Actor
{
    private final String catchs = "mysql-connector-java-5.1.23-bin.jar";
    private String dBase = "jdbc:mysql://localhost/greenfoot";
    private String username;
    private String password;
    private Connection con;
    private Statement stmt;
    private String dBaseH = "bee";
    private String usernameH = "root";
    private String passwordH = "";
    public void key()
    {
        if(Greenfoot.isKeyDown("right"))
    {
        move(5);
    }
    
        if(Greenfoot.isKeyDown("left"))
    {
        move(-5);
    }
    
        if(Greenfoot.isKeyDown("down"))
    {
        setLocation(getX(), getY()+5);
    }
    
        if(Greenfoot.isKeyDown("up"))
    {
        setLocation(getX(), getY()-5);
    }
}