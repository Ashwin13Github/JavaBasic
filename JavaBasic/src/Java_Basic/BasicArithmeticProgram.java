package Java_Basic;
import java.util.*;
public class BasicArithmeticProgram {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.print("Enter A value:");
		int a=input.nextInt();
		System.out.print("Enter B value:");
		int b=input.nextInt();
		System.out.println("******");
		int add=a+b;
		System.out.println(add);
		int sub=a-b;
		System.out.println(sub);
		int mul=a*b;
		System.out.println(mul);
		float div=a/b;
		System.out.println(div);
		float mod=a%b;
		System.out.println(mod);
	}

}
