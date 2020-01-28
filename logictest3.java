import java.util.Scanner; 

public class MainClass
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
	
		System.out.print("Berapa banyak baris yang kamu inginkan? ");
	
		int numbRow=sc.nextInt();
		
		System.out.println(" ");
		
		System.out.print("Hasil:\n");
	
		int rCount=1; 
	
		int i,j;
	
		for(i=numbRow; i>=1; i-- ){
		    
			for(j=numbRow; j>=i; j--){
			    
			System.out.print(j+" "); 
			
			}
			
		System.out.println();
		
		rCount++;
		
		}	 
	}
}