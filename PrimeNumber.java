package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int input=13;
		boolean flag=false;
		int rem=0;
		for(int i=2;i<=input/2;i++)
		{
			rem=input%i;
			if(rem==0)
				flag=true;
		
break;
			
			
		}
		if(flag)
		{
			System.out.println("The input number is not  prime");
			
		}
		
		else
		{
			System.out.println("The input number is prime");
		}
		// TODO Auto-generated method stub

	}

}
