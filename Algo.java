import java.util.Scanner;

public class Algo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("length");
			int n=sc.nextInt();
			int a[]=new int[n];
			int pos=-1;
			System.out.println("array");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("value");
			int val=sc.nextInt();
			for(int i=0;i<n;i++) {
				if(a[i]==val) {
					pos=i;
				}
			}
			if(pos==-1) {
				System.out.println("value is not present in the array");
				return;
			}
			System.out.println(pos);
		}
	}


