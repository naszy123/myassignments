package week1.day1;

public class Saturdayhomeassignment {
 //fibbinocci
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a1= 0, a2=1,sum,j,count=11;
	System.out.println(a1+" "+a2);
	
	for(j=2;j<count;++j)
	{
		sum= a1+a2;
		a1=a2;
		a2=sum;
		System.out.println(sum);
		
		
	}
		

	}

}
