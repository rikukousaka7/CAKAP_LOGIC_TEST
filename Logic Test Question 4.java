import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Berapa banyak baris yang kamu inginkan? ");

        int numbRow = sc.nextInt();
        
        System.out.println("Hasil:");
        
        for (int i = 1; i <= numbRow; i++)
        {
            int j = i;
            int k = j + 2;
			
                 System.out.print(j + " + 2 = " + k); 

            System.out.println();
        }
    }
}
