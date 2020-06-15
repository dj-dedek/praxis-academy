import java.util.ArrayList;

public class main
{
    public static void main(String[] args) 
    {
        ArrayList<String> colors = new ArrayList<String>();
        
        colors.add("blue");
        colors.add("red");
        colors.add("green");

        System.out.println(colors.size());

        System.out.println(colors.get(0));

        colors.remove(0);

        System.out.println(colors.size());

        System.out.println(colors);

        colors.add("violet");

        System.out.println("-------------------");

        for(String s : colors)
        {
            System.out.println(s);
        }
    }

}