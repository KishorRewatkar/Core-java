package pattern;

public class pp15 {

	public static void main(String[] args) {
		
		for(int i=-1; i<12; i=i+2)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}		
		for(int i=-3; i<11; i=i+2)
		{
			for(int j=1; j<7-i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		 
//		for(int i=0; i<5; i++)
//		{
//			for(int j=0; j<5; j++)
//			{
//				if(j-i<0)
//				System.out.print(" ");
//				else
//					System.out.print("*");
//			}
//			System.out.println(" ");
//		}
//		for(int i=1; i<7; i++)
//		{
//			for(int j=0; j<i; j++)
//			{
//				System.out.print(""+"*");
//			}
//			System.out.println("  ");
//		}
	}
}
