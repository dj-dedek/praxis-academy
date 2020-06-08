public class main
{
    public static void main(String args[])
    {
        // for(int i=0; i<=10; i++)
        // {
        //     System.out.println(i);
        // }
        for (int i = 0; i < 10; i++)
        {
            if(i < 5) continue; // batalkan saat ini melalui loop, mulai lagi di loop
                System.out.println(i);
            if(i > 7) break; // hentikan sepenuhnya loop ini dan lanjutkan
        }
        // setelah break, eksekusi dilanjutkan di sini
    }
}