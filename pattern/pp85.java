package pattern;

public class pp85 {

	public static void main(String[] args) {
		
		for(int i=0; i<=5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(i==2 || j==2)
				{
					
					System.out.print("* ");
				}
				else
				{ 
					if(i==0 || j==0 && i==1 || j==1)
					{
						System.out.print("O");
					}
					else 
					{
						System.out.print("");
					}
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
