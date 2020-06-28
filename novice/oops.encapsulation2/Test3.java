

public class Test3 extends AccessModifiers {
    public static void main(String[] args) {
        Test3 obj = new Test3();
        // System.out.println(obj.age); // Not accessible
        // System.out.println(obj.name); // Not accessible
        System.out.println(obj.salary);
        System.out.println(obj.address);
    }
}