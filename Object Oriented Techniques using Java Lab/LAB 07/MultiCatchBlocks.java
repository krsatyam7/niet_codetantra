package q11331;
public class MultiCatchBlocks {
	public void multiCatch(int[] arr,int index){
		try{
			System.out.println(arr[index]);
			System.out.println(arr[index]/index);
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero exception occurred");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bounds exception occurred");
		}
		catch(Exception e){
			System.out.println("Exception occurred");
		}
	}
}
