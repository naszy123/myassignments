package week1.day1;

public class Isprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		boolean flag= true;
		if(n>1) {
			for(int i=2; i<n; i++) {
				if(n%i==0)
				{
					System.out.println("is not a prime");
					flag= false;
					break;
				}

			}

			if (flag == true)
			{
				System.out.println("is prime");

			}

		}
		else {System.out.println("is not prime");
		}
	}

}
