package edu.rose_hulman;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Retrieve the USER_PROFILE environment variable value
        String userProfile = System.getenv("USERPROFILE");
        
        // Print out the greeting message with the user profile
        System.out.println("Hello " + userProfile + "!");
    }
}
