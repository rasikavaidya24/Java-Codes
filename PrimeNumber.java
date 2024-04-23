import java.util.*;
class PrimeNumber
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int count = 0;

		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			    break;
			}
		}
		if(count==num)                                                                                                                                                  )
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}

}
	