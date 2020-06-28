
import oops.encapsulation.AccessModifiers;

public class Test2 {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        // System.out.println(obj.age); // Not accessible
        // System.out.println(obj.name); // Not accessible
        // System.out.println(obj.salary); // Not accessible
        System.out.println(obj.address); 
    }
}