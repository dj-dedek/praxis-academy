
public class Test {

    // default constructor
    public Test() {
        System.out.println("t-1");
    }
    
    public Test(int a) {
        this();
        System.out.println("t-2");
    }
    
    public Test(int a, int b) {
        this(20);
        System.out.println("t-3");
    }


    public static void main(String[] args) {
        Test obj = new Test(20, 30);
    }
}