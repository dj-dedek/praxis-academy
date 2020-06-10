public class main
{

    public static void main(String[] args) 
    {
        int[][] a = {
            {12,13,14},
            {15,44,25},
            {14,45,82}
        };
        
        System.out.println(a[1][0]);

        System.out.println("-------------");

        for(int[] ar : a)
        {
            for(int x : ar)
            {
                System.out.println(x);
            }
        }
    }

} 