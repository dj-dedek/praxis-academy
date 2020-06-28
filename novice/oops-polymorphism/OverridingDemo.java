// package oops.polymorphism;

class Parent {
    void show() {
        System.out.println("P-show");
    }

    void delete() {
        System.out.println("P-delete");
    }
}
class Child extends Parent {
    void show() {
        System.out.println("C-show");
    }

    void insert() {
        System.out.println("C-insert");
    }
}

public class OverridingDemo {
    public static void main(String[] args)
    {
        System.out.println("----obj4----");
        // Child obj4 = new Parent(); // cannot do this
        // Child obj4=(Child)new Parent();
        // obj4.show();
        // obj4.insert();
        // obj4.delete();

        System.out.println("----obj3----");
        Parent obj3 = new Parent();
        obj3.show();
        obj3.delete();
        // obj3.insert(); // can't access coz deklasrasi class Parent
        
        System.out.println("----obj1----");
        Child obj = new Child();
        obj.show();
        obj.insert();
        obj.delete();
        
        System.out.println("----obj2----");
        Parent obj2 = new Child();
        obj2.show();
        // p.insert(); // can't access coz deklasrasi class Parent
        obj2.delete();
    }
}