import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        // int[] numbers = new int[20];

        // for(int i = 0; i < numbers.length; i++)
        // {
        //     // numbers[i] = i + 1;
        //     System.out.println(numbers[i]);
        // }
        
        /** */
            int i, j, m, n; // Deklarasi
            int matriks1[][] = new int[10][10]; // deklarasi array 2 dimensi
            int matriks2[][] = new int[10][10];
            int hasil[][] = new int[10][10];
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan jumlah baris matriks: ");
            m = scan.nextInt();
            System.out.print("Masukkan jumlah kolom matriks: ");
            n = scan.nextInt();
            System.out.println("Masukkan elemen matriks pertama: ");
            for (i = 0; i < m; i++) 
            {
                for (j = 0; j < n; j++) 
                {
                    matriks1[i][j] = scan.nextInt();
                }
            }
            System.out.println("Masukkan elemen matriks kedua: ");
            for (i = 0; i < m; i++) 
            {
                for (j = 0; j < n; j++) 
                {
                    matriks2[i][j] = scan.nextInt();
                }
            }
            System.out.println("Hasil penjumlahan matriks: ");
            for (i = 0; i < m; i++) 
            {
                for (j = 0; j < n; j++) 
                {
                    hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                    System.out.println(hasil[i][j] + "\t");
                }
                System.out.println();
            }
        /**/
    }
}