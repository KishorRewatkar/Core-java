package pattern;

public class Hw20 {

	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=7;i=i+2)
		{
			int b=a;
			boolean flag = false;
			for(int j=1;j<=i;j++)
			{
				System.out.print(b);
				if(b==1)
					flag = true;
				if(flag)
					b++;
				else
					b--;
			
			}
			System.out.println();
			a++;
		}
	}
}
