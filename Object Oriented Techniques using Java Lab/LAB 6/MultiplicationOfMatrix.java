package q11106;
public class MultiplicationOfMatrix{
        public int[][] multiplication(int[][] matrix1, int[][] matrix2) {
                /*Return the result if the matrix1 coloumn size is equal to matrix2 row size and print the result.
                * @Return null.
                */
                // Write your logic here for matrix multiplication
                int r1 = matrix1.length;
                int r2 = matrix2.length;
                int c1 = matrix1[0].length;
                int c2 = matrix2[0].length;

                if(r2 != c1)
                return null;
                else{
                        int res[][] = new int[r1][c2];
                        for(int i=0;i<r1;i++){
                                for(int j=0;j<c2;j++){
                                        for(int k=0;k<r2;k++){
                                                res[i][j] += matrix1[i][k] * matrix2[k][j];
                                        }
                                }
                        }

                        return res;
                }
        }
}
