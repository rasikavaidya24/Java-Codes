import java.util.*;
class Fibonacci
{
	public static void main(String[] args) {
	int num1=0;
	int num2=1;
	System.out.println(num1 +" "+ num2+" ");
	for(int i=1;i<=8;i++)
	{
		int output=num1+num2;
		System.out.println(output+" ");
		num1=num2;
		num2=output;

	}

   }

}