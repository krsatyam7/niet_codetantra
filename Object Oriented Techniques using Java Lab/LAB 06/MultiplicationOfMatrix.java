package q11106;
public class MultiplicationOfMatrix{
	public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
		int row1 = matrix1.length;
		int col1 = matrix1[0].length;
		int row2 = matrix2.length;
		int col2 = matrix2[0].length;
		if(row2!=col1){
			return(null);
		}
		else{
			int c[][] = new int [row1][col2];
			int i,j,k;
			for(i=0;i<row1;i++){
				for(j=0;j<col2;j++){
					c[i][j]=0;
					for(k=0;k<row2;k++){
						c[i][j]+=matrix1[i][k]*matrix2[k][j];
					}
				}
			}
			return c;
		}
	}
}
