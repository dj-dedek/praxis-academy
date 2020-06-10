import java.util.Vector;

public class main
{
    public static void main(String[] args) 
    {
        Vector<String> v = new Vector<String>();

        v.add("test");
        v.add("foo");
        v.add("barr");
        // v.add("another test");

        System.out.println(v);
        System.out.println(v.size());
        v.remove(3);
        System.out.println(v);

        for(String s : v)
        {
            System.out.println(s);
        }

        System.out.println("---------");

        String[] sr = new String[v.size()];

        sr = v.toArray(sr);

        // System.out.println(sr);

        for(String s : sr )
        {
            System.out.println(s);
        }

    }
} 