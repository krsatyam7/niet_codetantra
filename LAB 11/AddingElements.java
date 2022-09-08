//JAVA program to implement the concept of  Collection classes.
//Read three array list values and add them 
//Print values
package q132;
import java.util.*;
class AddingElements{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List <String>items=new ArrayList<>();
		System.out.print("Enter any three collections: ");
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		Collections.addAll(items,a,b,c);
		for(int i=0;i<items.size();i++){
			System.out.print(items.get(i)+" ");
		}
	}
}
