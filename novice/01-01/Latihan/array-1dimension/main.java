public class main 
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3};
        System.out.println(a); // output : [I@6f2b958e (reference pointer), default array

        int[] b = new int[3]; // menentukan jumlah array dengan keyword "new"
        b[0] = 30; // assign value int type data
        b[1] = 31;
        b[2] = 33;
        System.out.println(b[2]);

        String[] s = new String[3];
        s[0] = "foo"; // assign value String type data
        s[1] = "bar";

        System.out.println(s[1]);

    }
}