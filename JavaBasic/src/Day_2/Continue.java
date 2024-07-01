package Day_2;

public class Continue {

	public static void main(String[] args) 
	{
		for (int k = 1; k < 10; k++)
		{
		// Odd numbers are skipped
		if (k%2 != 0)
		continue;
		// Even numbers are printed
		System.out.println(k);
		}
	}
}
