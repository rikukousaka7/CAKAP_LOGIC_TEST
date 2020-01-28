import java.util.Scanner;

public class MainClass
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Berapa banyak pyramid yang kamu inginkan?");
 
        int numbRow = sc.nextInt();
 
        int rCount = numbRow;
 
        System.out.println("Hasil:");
 
       for(int i = rCount; i >= 1; --i) 	   
	   {   
	   
			for(int j = 1; j <= i; ++j) 			
			{   
				System.out.print(j + " ");          
			} 
			
			System.out.println();	
        }
    }
}