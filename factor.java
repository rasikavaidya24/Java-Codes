import java.util.*;
class factor
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();


	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{

		System.out.println(i+" ");
	   }
	}
	}
}

// Enter a number :20
// 1
// 2
// 4
// 5
// 10
// 20