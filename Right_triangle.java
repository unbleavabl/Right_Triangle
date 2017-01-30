import java.util.Scanner;

class Right_triangle
{
	public static void main(String[] args)
	{
		Scanner u_inp = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = u_inp.nextInt();
		for(int i = 0; i < n ; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}


