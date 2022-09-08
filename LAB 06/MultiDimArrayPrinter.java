package q10946;
import java.util.Scanner;
public class MultiDimArrayPrinter {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int J;
		System.out.print("Enter Number of rows: ");
		int m = sc.nextInt();
		System.out.print("Enter Number of columns: ");
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for(int i=0;i<m;i++){
			J=i+1;
			System.out.print("Enter row "+J+": ");
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<m;k++){
			for(int l=0;l<n;l++){
			System.out.print(a[k][l]+" ");	
			}
			System.out.println();
		}
	}
}
