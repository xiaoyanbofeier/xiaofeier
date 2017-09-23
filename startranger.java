package startranger;

public class startranger 
{
	public static void main(String[] args)
	{
		int n = 5,i,j,k;
		for(i = 0;i < n;i ++)
		{
			for(j = n-i;j >= 0;j --)
				System.out.printf(" ");
			for(k = 0;k <= 2*i;k++)
				{
				System.out.printf("*");
				}
			System.out.println(" ");
		}
		
	}
}
