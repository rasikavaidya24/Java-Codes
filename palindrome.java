// import java.util.*;
// class palindrome
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner (System.in);
// 		System.out.println("Enter a number :");
// 		int num = sc.nextInt();
// 		int dup=num;
// 		int rev=0;
- 
// 		while(num>0)
// 		{
// 			int rem=num%10;
// 			rev=rev*10+rem;
// 			num/=10;
// 		}
// 		System.out.println((dup==rev)?"palindrome":"not a palindrome");

// 	}
// }

//Palindrome String

import java.util.*;
class palindrome
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number :");
		String name = sc.next();
		String revname ="";

		for(int i=name.length()-1;i>=0;i--)
		{
			revname +=name.charAt(i);
		}
		System.out.println((revname.equals(name))?"palindrome":name+"not palindrome");
	}
}

