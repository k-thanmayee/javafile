import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("length");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("array");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("value");
			int val=sc.nextInt();
			int mid=a[n/2];
			int pos=-1;
			if(val==mid) {
				pos=n/2;
			}
			else if(val<mid) {
				for(int i=0;i<n/2;i++) {
					if(a[i]==val) {
						pos=i;
					}
				}
			}
			else if(val>mid) {
				for(int i=n/2;i<n;i++) {
					if(a[i]==val) {
						pos=i;
					}
				}
			}
			
			if(pos==-1) {
				System.out.println("value is not present in the array");
				return;
			}
			System.out.println(pos);
	}

}
