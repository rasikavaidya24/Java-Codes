import java.util.*;
class LeapYear
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr an Year :");
		int year = sc.nextInt();

		 if(((year % 4==0)&& (year % 100!=0))|| (year % 400==0))
		 {
		 	System.out.println("year is a leap year :");
		 }else{
		 	System.out.println("year is not a leap year :");
		 }
	}
}


// Enetr an Year :
// 2019
// year is not a leap year :

// C:\Users\RASIKA\Desktop\java\J>java LeapYear
// Enetr an Year :
// 2024
// year is a leap year :

// C:\Users\RASIKA\Desktop\java\J>java LeapYear
// Enetr an Year :
// 2020
// year is a leap year :

// C:\Users\RASIKA\Desktop\java\J>java LeapYear
// Enetr an Year :
// 2021
// year is not a leap year :
