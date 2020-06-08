package Variable2;

public class Main {

    static void OutPut(Object s)
    {
        System.out.println(s);
    }


    public static void main(String[] args) {
        int x,y,z,i = 1;

        String a,b,c;

        i++;

        OutPut(i);
        // System.out.println(i);

        // System.out.println(i);

        // System.out.println(i);

        i--;

        System.out.println(i);

        i--;

        System.out.println(i);

        i+=3;

        System.out.println(i);

        i-=4;

        System.out.println(i);

        x = 2;

        y = 5;

        x = 1 + y;

        System.out.println(x);

        z = (1+1)*2;

        System.out.println(z);

        z = 10/2;

        System.out.println(z);

        a = "Lorem";

        b = "ipsum";

        c = a + b;

        System.out.println(c);
    }
}