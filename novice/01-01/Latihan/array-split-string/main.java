public class main{

    public static void main(String[] args) 
    {
        String x = "aaaa, bbb, ccc, ddd";
        
        String[] y = x.split(",");

        for(String s : y)
        {
            System.out.println(s);
        }

        System.out.println("I would not banish all of these Internets.".substring(25, 31));
    }

}