/**
 * Access Modifiers
 * Within Class : 
 * 1. Default : Can access
 * 2. Private : Can access
 * 3. Protected : Can access
 * 4. Public : Can access
 * 
 * Outside of class but within same package : 
 * 1. Default : Can access
 * 2. Private : Can't access
 * 3. Protected : Can access
 * 4. Public : Can access
 * 
 * Outside of class with another package : 
 * 1. Default : Can't access
 * 2. Private : Can't access
 * 3. Protected : Can't access
 * 4. Public : Can access
 * 
 * Outside of class and in another package but with inheritance : 
 * 1. Default : Can't access
 * 2. Private : Can't access
 * 3. Protected : Can't access
 * 4. Public : Can access
 * 
 * @author dedekjulianto
 * 
 */
public class AccessModifiers {
    int age = 20; // default
    private String name = "Dedek";
    protected double salary = 5000;
    public String address = "jakarta";
}