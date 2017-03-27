import java.util.*;
import java.util.Scanner;
public class main {
	
	/**W³asnoœæ Jana Miko³ajczyka**/
	public static double[] bubblesort(double a[])
	{
		double sortedArray[] = a;
		for(int  i = 0; i<sortedArray.length;i++)
		 {
			 for(int  j =0 ; j<sortedArray.length -1; j++)
			 {
				if(sortedArray[j]>sortedArray[j+1] )
				{
					double temp = sortedArray[j];
					sortedArray[j]= sortedArray[j+1];
					sortedArray[j+1]=temp;
					
					
				}
			 }
		 }
		return sortedArray; 
	}
	public static void bubblesort2(double a[])
	{

		for(int  i = 0; i<a.length;i++)
		 {
			 for(int  j =0 ; j<a.length -1; j++)
			 {
				if(a[j]>a[j+1] )
				{
					double temp = a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
					
					
				}
			 }
		 }
		
	}

	
	
	
	
public static void main(String[] args){
	   Scanner in = new Scanner(System.in);
	System.out.println("podaj trzy dowolne liczby z ktorych chcia³bys utworzyc trójk¹t prostok¹tny z czego ostatnia liczba jest liczba przyprostokatnej");
	double boki[] = new double[3];
	System.out.println("podaj 3 boki trójkata");
	 try
	 {
		for(int i = 0; i<boki.length;i++)
		 {
			 System.out.println("podaj bok nr "+(i+1));
			 boki[i] = in.nextDouble();
		 }
	 }
	 catch(Exception e )
	 {
		 System.out.println(e.getMessage());
	 }
	//boki = bubblesort(boki);
		 
	 bubblesort2(boki); 
	 
	// System.out.println(Arrays.toString(boki));
	 if((Math.pow(boki[0], 2)+Math.pow(boki[1], 2)) == Math.pow(boki[2], 2) )
	 {
		 System.out.println(" trojkat jest prostokatny");

	 }
	 else
	 {
		 System.out.println(" trojkat nie jest prostokatny");

	 }
	 
	
	/*int b = in.nextInt();
	int c = in.nextInt();
	int max = in.nextInt();
		
					if(a*a ==b*b+c*c)
					{
				     a = max;
						System.out.println(" trojkat jest prostokatny");

				
					}
					else
					{
						System.out.println(" trojkat nie jest prostokatny");

					}		 
		
		    if( b>max || b>c)			
			{
				max = b;  
         
				if(max*max == a*a + c*c) 
				{
					System.out.println(" trojkat jest prostokatny");
					
					
				}
				else
				{
					System.out.println(" trojkat nie jest prostokatny");
				}
			}
			
			
		 
			if( c>max || c>a)	
			{
	         max = c;
	         	if(max*max == a*a+b*b )
	         	{
	         		System.out.println(" trojkat jest prostokatny");

	         	}
	         	else
	         	{
	         		System.out.println(" trojkat nie jest prostokatny");

	         	}
	         	
	        }
		
		 
	/*if(a*a +b*b ==c*c)
	{
		System.out.println("trójkat jest prostkokatny twierdzenie pitagorasa jest spelnione");
	}
	else 
	{
		System.out.println("trojkat nie jest prostokatny(nie jest spelnione twierdzenie pitagorasa)");
	*/
		// zabezpiecz przed null ,potegowanie schemat blokowy + program, wszystko w metodach

}
}
