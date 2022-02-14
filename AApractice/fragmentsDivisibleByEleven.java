
import java.util.*;
public class fragmentsDivisibleByEleven {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String s = Integer.toString(n);

		int arr[]=new int[s.length()];
		int x=0;
		int sum=0;
		while(n>0) {

			int res=n%10;
			arr[x]=res;
			n/=10;

			x++;
		}

		 int i, k, t; 

	        for (i = 0; i < x / 2; i++) { 
	            t = arr[i]; 
	            arr[i] = arr[x - i - 1]; 
	            arr[x - i - 1] = t; 
	        } 
		int c=0;

		for(int p=0;p<x;p++) {
			sum=arr[p];
			for(int j=p+1;j<x;j++) {
				sum=sum*10+arr[j];
					if(sum%11==0) {
					c++;
				}
			}
		}
		System.out.println(c);   
	}

}


