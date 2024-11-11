package q13212;
class CTJ13212{
	public static void main(String arg []){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		int totalSubset = 1<<n;
		int max= 0;
		for(int i = 0; i<totalSubset; i++) {
			int temp = 1;
			for(int j = 0; j<n;j++) {
				if((i&(1<<j))!=0) {
					temp^= a[j];
					max = Math.max(temp,max);
				}
			}
		}
		System.out.println(max);
	}
}
