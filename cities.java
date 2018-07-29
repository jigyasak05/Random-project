package contest;

import java.util.Arrays;
import java.util.Scanner;

public class cities {

	public static void main(String[] args) {
		  Scanner s =new Scanner(System.in);
			int t=s.nextInt();
			int[] n=new int[t];
			long[][] arr=new long[t][];
			long[] k=new long[t];
			for(int i=0;i<t;i++) {
				n[i]=s.nextInt();
				k[i]=s.nextInt();
				arr[i]=new long[n[i]];
				for(int j=0;j<n[i];j++) {
					arr[i][j]=s.nextInt();
				}
			}
		for(int i=0;i<t;i++) {
			Arrays.sort(arr[i]);
			long sum=0;
			int c=0;
		for(int j=0;j<n[i];j++) {
			if(sum+arr[i][j]<=k[i]) {
					sum+=arr[i][j];
				c++;
				}
			}
			System.out.print(c+" ");
			System.out.println(k[i]-sum);
		
		}
	}

}
