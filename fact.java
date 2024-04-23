// import java.util.*;
// class fact
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner (System.in);
// 		System.out.println("Enter a number :");
// 		int num = sc.nextInt();
// 		int fact=1;

// 		for(int i=num;i>=1;i--)
// 		{
// 			fact=fact*i;
// 		}
// 		System.out.println(fact);
// 	}
// }
//year is leap yera
//wap number is krishnmurti number-seperate digit ,find fact,sum of fact
//


import java.util.*;
class fact
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int fact=1;

		for(int i=1; i<=num; i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}

// Enter a number :5
// 5*4*3*2*1
// 120

// C:\Users\RASIKA\Desktop\java\J>java fact
// Enter a number :4
// 4*3*2*1
// 24