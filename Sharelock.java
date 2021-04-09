import java.util.*;
import java.io.*;
class Sharelock
{
	public static void main(String[] args)throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array length:");
		int len=scan.nextInt();
		int arr[]=new int[len];
		int sum=0,flag=0;
		for(int i=0;i<len;i++)
		{
			arr[i]=scan.nextInt();
			sum+=arr[i];
		}
		int x=0,y;
		for(int i=0;i<len;i++)
		{
			y=arr[i];
			if((sum-y)==2*x)
			{
				flag=1;
				
				break;
			}
			x+=y;
		}
		if(flag==0)
		{
			System.out.println("False");
		}
		else	
			System.out.println("True");
	}
}