
import java.util.Scanner;

// package HelloWorld;

public class Main
{
    static int a,b;
    static int hasil;
    static char operator;

    public static void operatorWrong() {
        System.out.println("Operasi yang anda gunakan salah!");
        // Output.s("Test");
    }
    public static void main(String[] args)
    {
        // args[0] = "test";
        // System.out.println(args);

        // for(String a : args)
        // {
        //     System.out.println(a);
        // }
        // S.o("Hello World 2");
        



        // a operator b 

        // int a,b,hasil;
        // char operator;
        // Main cal = new Main();
        Scanner s = new Scanner(System.in);

        System.out.print("Nilai a  : ");
        a = s.nextInt();
        System.out.print("Operator : ");
        operator = s.next().charAt(0);
        System.out.print("Nilai b  : ");
        b = s.nextInt();

        System.out.println("Input user : " + a + " " + operator + " " + b);


        // operasi penjumlahan
        if(operator == '+') {
            hasil = a + b;
            System.out.println("Hasilnya adalah : " + hasil);

        // operasi pengurangan    
        } else if(operator == '-'){
            hasil = a - b ;
            System.out.println("Hasilnya adalah : " + hasil);

        // operasi perkalian   
        } else if(operator == '*'){
            hasil = a * b ;
            System.out.println("Hasilnya adalah : " + hasil);

        // operasi pembagian   
        } else if(operator == '/'){
            hasil = a / b ;
            System.out.println("Hasilnya adalah : " + hasil);
        } else if(operator == '%'){
            hasil = a % b ;
            System.out.println("Hasilnya adalah : " + hasil);
        } else{
            operatorWrong();
        }

    }
}