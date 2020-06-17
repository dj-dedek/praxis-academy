/**
 * 
 * 
 * Super Class = kelas yang fitur-fiturnya diwariskan dikenal sebagai kelas super (Base class or Parent class)
 * Sub Class 
 * 
 * 
 * // Single Inheritance
 * class A {
 * 
 * }
 * class B extends A {
 * 
 * }
 * 
 * // Multilevel Inheritance
 * class C extends B {
 * 
 * }
 * 
 * // Hierarchical Inheritance
 * class B1 extends A {
 * 
 * }
 * class B2 extends A {
 * 
 * }
 * class B3 extends A {
 * 
 * }
 * 
 * // Multiple Inheritance ( this is not supported in java )
 * class A {
 * 
 * }
 * class B {
 * 
 * }
 * class C extends A,B {
 * 
 * }
 * 
 * // Hybrid Inheritance ( this is also not supported in java )
 * class A {
 * 
 * }
 * class B extends A {
 * 
 * }
 * class C extends A {
 * 
 * }
 * class D extends B, C {
 * 
 * }
 * 
 * 
 */



class GrandParent {
    void delete() {
        System.out.println("g-delete");
    }
}

class Parent extends GrandParent {
    // public Parent() {
    //     System.out.println("p-const");
    // }
    
    int age = 30;
    void show() {
        System.out.println("p-show");
    }
    void display() {
        System.out.println("p-display");
    }
}

class Child extends Parent {
    // public Child() {
    //     System.out.println("c-const");
    // }
    void insert() {
        System.out.println("c-insert");
    }
}
    
public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        // System.out.println(obj.age);
        obj.show();
        obj.display();
        obj.insert();
        obj.delete();

        Parent p = new Parent();
        p.delete();
        p.show();
        p.display();
        // p.insert(); // can't access class inheritance

        GrandParent g = new GrandParent();
        g.delete();
        // g.show(); // can't access class inheritance
    }
}