import java.util.Scanner;

public class Main
{
    public int a,b;
    public int hasil;
    public char operator;

    public static int penjumlahan(int a, int b) {
        
        int hasil = a + b;
        System.out.println(hasil);
        return hasil;
    }

    public static int pengurangan(int a, int b) {
        
        int hasil = a - b;
        System.out.println(hasil);
        return hasil;
    }

    public static int pembagian(int a, int b) {
        
        int hasil = a / b;
        System.out.println(hasil);
        return hasil;
    }

    public static int perkalian(int a, int b) {
        
        int hasil = a * b;
        System.out.println(hasil);
        return hasil;
    }

    public static int sisaBagi(int a, int b) {
        
        int hasil = a % b;
        System.out.println(hasil);
        return hasil;
    }
    
    public static void operatorWrong() {
        System.out.println("Operasi yang anda gunakan salah!");
        // Output.s("Test");
    }

    public static void isValue() {
        System.out.print("Hasilnya adalah : ");
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
        

        int a,b;
        char operator;
        Scanner s = new Scanner(System.in);

        System.out.print("Nilai a  : ");
        a = s.nextInt();
        System.out.print("Operator : ");
        operator = s.next().charAt(0);
        System.out.print("Nilai b  : ");
        b = s.nextInt();

        System.out.println("Input user : " + a + " " + operator + " " + b);
        
        switch(operator) {
            case '+' : {
                isValue();
                penjumlahan(a, b);
                break;
            }
            case '/' : {
                isValue();
                pembagian(a, b);
                break;
            }
            case '*' : {
                isValue();
                perkalian(a, b);
                break;
            }
            case '-' : {
                isValue();
                pengurangan(a, b);
                break;
            }
            case '%' : {
                isValue();
                sisaBagi(a, b);
                break;
            }
            default : {
                operatorWrong();
            }
        }
        s.close();

        // operasi penjumlahan
        // if(operator == '+') {
        //     hasil = a + b;
        //     System.out.println("Hasilnya adalah : " + hasil);

        // // operasi pengurangan    
        // } else if(operator == '-'){
        //     hasil = a - b ;
        //     System.out.println("Hasilnya adalah : " + hasil);

        // // operasi perkalian   
        // } else if(operator == '*'){
        //     hasil = a * b ;
        //     System.out.println("Hasilnya adalah : " + hasil);

        // // operasi pembagian   
        // } else if(operator == '/'){
        //     hasil = a / b ;
        //     System.out.println("Hasilnya adalah : " + hasil);
        // } else if(operator == '%'){
        //     hasil = a % b ;
        //     System.out.println("Hasilnya adalah : " + hasil);
        // } else{
        //     operatorWrong();
        // }

    }
}