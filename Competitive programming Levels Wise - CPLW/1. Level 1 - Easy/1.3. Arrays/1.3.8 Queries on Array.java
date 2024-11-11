package q14112;
class CTJ14112{
	public static void main(String arg[]){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long diff [] = new long [n+1];
		for(int i=0;i<m;i++){
			int a = sc.nextInt()-1;
			int b = sc.nextInt();
			int v = sc.nextInt();
			diff[a] +=v;
			if(b<n){
				diff [b]-=v;
			}
		}
		long maxVal = Long.MIN_VALUE;
		long currVal = 0;
		for(int i=0;i<n;i++){
			currVal += diff[i];
			maxVal = Math.max(maxVal, currVal);
		}
		System.out.println(maxVal);
	}
}
