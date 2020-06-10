import java.util.ArrayList;
import java.util.Arrays;

public class main
{
    public static void main(String[] args) 
    {
        Double[] a = {4.0,5.5,3.6,6.2,7.0,33.0};

        // data types classname: Integer, Long, Float, Double, Byte

        ArrayList<Double> b = new ArrayList<Double>( Arrays.asList(a) );

        for(double n : b)
        {
            System.out.println(n);
        }

        System.out.println("----------");

        Double[] c = new Double[b.size()];

        c = b.toArray(c);

        for(double n : c)
        {
            System.out.println(n);
        }

        System.out.println("----------");

        String s = "foo,bar,few,fafa,fafkaf,aagggag";

        String[] sr = s.split(",");

        ArrayList<String> sal = new ArrayList<String>( Arrays.asList(sr) );

        for(String n : sal)
        {
            System.out.println(n);
        }

        // System.out.println(sr[]);
    }
}