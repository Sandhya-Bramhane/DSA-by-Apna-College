
public class Diagonal_matrix {


public static int DiagonalMatrix(int matrix[][]) {

int sum =0;
int n = matrix.length;

for (int i = 0; i < n; i++) {
  
sum = sum + matrix[i][i];
sum = sum + matrix[i][n-i-1];

if (n % 2 != 0) {
  sum= sum-matrix[n/2][n/2];
   }
}
  return sum;
}

  public static void main(String[] args) {
    int matrix[][]= {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
     
    int result = DiagonalMatrix(matrix);
    
    System.out.println("Sum of diagonals: " + result);
    
  }
  
}