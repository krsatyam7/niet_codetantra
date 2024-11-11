package q14129;
import java.util.*;
class CTJ14129{
	public static void main(String arg []) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int l = 0;
		int r = n-1;
		while(l<=r) {
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
		for(int i:a) {
			System.out.print(i+" ");
		}
		return;
	}
}
