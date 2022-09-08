package q10946;
import java.util.Scanner;
class MultiDimArrayPrinter{
        public static void main(String args[]){
                int n, m, j, i;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter Number of rows: ");
                m = sc.nextInt();
                System.out.print("Enter Number of columns: ");
                n = sc.nextInt();
                int a[][] = new int[m][n];
                for(i = 0; i < m; i++){
                        System.out.print("Enter row " + (i + 1) + ": ");
                        for(j = 0; j < n; j++){
                                a[i][j] = sc.nextInt();
                        }
                }
                for(i = 0; i < m; i++){
                        for(j = 0;j < n; j++){
                                System.out.print(a[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}
