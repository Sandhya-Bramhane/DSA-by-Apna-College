public class Transposed {
  
public static void PrintOriginalMatrix(int matrix[][]) {
  System.out.println("Original Matrix");
  for (int i = 0; i < matrix.length; i++) {

    for (int j = 0; j < matrix[0].length; j++) {
      
      System.out.print(matrix[i][j]+"  ");
    }
System.out.println();
  }
}

  public static void main(String[] args) {
    int row = 2;
    int col = 3;
    int matrix[][] = {
        {2,4,5},
        {8,9,7}
    };

     PrintOriginalMatrix(matrix);


     System.out.println("Transposed Matrix");

     int[][] Transposed = new int[col][row];


     for (int i = 0; i < row; i++) {
   
       for (int j = 0; j < col; j++) {
         
         Transposed[j][i] = matrix[i][j];

       }
     }

     PrintOriginalMatrix(Transposed);
  }
}
