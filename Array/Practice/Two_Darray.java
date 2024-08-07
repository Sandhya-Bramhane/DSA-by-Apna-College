import java.util.*;

public class Two_Darray {

  public static Boolean Search(int matrix[][], int key) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == key) {
          System.out.println("Found at Cell (" + i + "," + j + ")");
          return true;
        }
      }
    }
    System.out.println("Key Not found");
    return false;
  }

  public static void main(String[] args) {
    int matrix[][] = new int[3][3];
    int n = matrix.length;
    int m = matrix[0].length;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the matrix:");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }

    System.out.println("The matrix is:");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    // Change the key here to test different values
    System.out.print("Enter the key to search: ");
    int key = sc.nextInt();

    Search(matrix, key);
  }
}
