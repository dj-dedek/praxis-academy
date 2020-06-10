public class main
{
    public static void main(String[] args)
    {
        int[] x = {77,33,44,56,77,57,47,10};

        String[] y = {"fafa","faaa","gag","ggt","agomgal","oafnafk","mfmlm","aggag"};

        System.out.println("x length "+x.length);

        for(int i = 0; i <= x.length-1; i++)
        {
            System.out.println("x["+i+"] = "+x[i]);
        }
        System.out.println("-----------------");

        for(int j : x) 
        {
            System.out.println(j);
        }
        System.out.println("-----------------");

        for(String s : y)
        {
            System.out.println(s);
        }
    }
}