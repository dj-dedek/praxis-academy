// package oops.polymorphism;

/**
 * Overloading:
 * same method name
 * no of parameter,
 * different data types
 * order of parameter
 * @author Dedek J
 */

class Test {
    int display() {
        System.out.println("display-1");
        return 0;
    }

    void display2() {
        System.out.println("display-2");
    }

    void show() {
        System.out.println("Test 1");
    }

    void show(int a) {

    }

    void show(String a) {

    }

    void show(int a, String b) {

    }

    void show(String b, int a) {

    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
        obj.display2();
        
    }   
}