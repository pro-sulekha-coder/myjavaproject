//this is a pattern app :D
import java.util.*;
class patternmix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter your choice: ");
		int choice=sc.nextInt();
		int i,j,k;
		switch(choice)
		{
			case 1:
			System.out.println("Enter the size:");
			k=sc.nextInt(); 
			System.out.println("Your pattern:\n");
			for(i=1;i<=k;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(j);
				}
				System.out.println();
			}
			break;
			case 2:
			System.out.println("Enter the size:");
			k=sc.nextInt();
			System.out.println("Your pattern:\n");
			for(i=1;i<=k;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(i);
				}
				System.out.println();
			}
			break;
			
			default:
				System.out.println("error");
				
		}
	}
}
