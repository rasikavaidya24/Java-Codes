import java.util.*;
class SquareRoot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		int sqrrt = 0;

		for (int i=1; i<=num; i++ ) {

			 if(i*i==num)
			 {
			 	flag = true;
			 	sqrrt = i;
			 	break;			 	
			 }			
		}
		if(flag)
		{
			System.out.println(sqrrt+ " is a perfect square root ");
		}
		else{
			System.out.println(sqrrt+ " do not have a perfect square root");
		}
	}
}