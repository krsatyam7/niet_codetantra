package q11075;

public class CountOfTwoNumbers {
	public boolean compareCountOf(int[] arr,int args1,int args2){
		int i,len,f1=-1,f2=-1;
		len=arr.length;
		for(i=len-1;i>=0;i--){
			if(arr[i]==args1){
				f1=i;
				break;
			}
		}
		for(i=len-1;i>=0;i--){
			if(arr[i]==args2){
				f2=i;
				break;
			}
		}
		if(f1>f2)
		return true;
		else
		return false;
	}
}
