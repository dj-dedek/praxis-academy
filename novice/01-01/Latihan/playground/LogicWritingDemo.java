public class LogicWritingDemo {
    public static void main(String[] args) {

        /* Reverse String */
        // String str = "abcd";
        // Stri

        /* Reverse String */
        // String str = "abcd";
        // String rev = "";
        // // System.out.println(str.charAt(3));

        // for(int i = str.length()-1; i>=0; i--)
        // {
        //     // rev = rev + str.charAt(i);
        //     System.out.println(str.charAt(i));
        //     // System.out.println(rev);
        //     // System.out.println(str);
        // }

        // System.out.println("Before Rev : "+str);
        // System.out.println("After Rev : "+rev);

        // String str = "abcd";
        // StringBuffer sb = new StringBuffer(str);
        // System.out.println(sb.reverse());
        

        /*  Factorial */
        // int angka = 8;
        // long fac = 1;

        // for(int i = angka; i > 0; i--) {
        //     fac = i * fac;
        //     // System.out.print(i+"*");
        // }
        // System.out.println("Faktorial dari "+angka+"!"+ " = "+fac);

        /* Swap Variable */
        int a = 10;
        int b = 20;

        System.out.println("Awal variable a = "+a+" b = "+b);
        
        int memo = b;
        b = a;
        a = memo;
        
        System.out.println("Setelah Swap Variable a = "+a+" b = "+b);

        System.out.println(a);
        

    }
}