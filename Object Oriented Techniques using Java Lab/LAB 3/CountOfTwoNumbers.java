package q11075;
import java.util.Scanner;
public class CountOfTwoNumbers {
        public void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter no of elements in the array:");
                int n = sc.nextInt();
                int arr[] = new int[n];
                System.out.println("Enter elements in the array separated by space:");
                for(int i=0;i<n;i++){
                        arr[i] = sc.nextInt();
                }
                System.out.println("Enter the arg1 element:");
                int arg1 = sc.nextInt();
                System.out.println("Enter the arg2 element:");
                int arg2 = sc.nextInt();
                boolean result = compareCountOf(arr, arg1, arg2);
        }
        public boolean compareCountOf(int[] arr, int arg1, int arg2) {
                //write your code here
                int c1 = 0, c2 = 0;
                for(int i=0;i<arr.length;i++){
                        if(arr[i] == arg1) 
                        {
                                c1 += 1;

                        }
                        if(arr[i] == arg2) 
                        {
                                c2 += 1;

                        }
                }
                if(c1 > c2) return true;
                else return false;
        }
}
