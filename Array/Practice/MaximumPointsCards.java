public class MaximumPointsCards {

public static int  KCardsSum(int cardPoints[], int k) {
  
int totalPoints = 0;
int n = cardPoints.length;


for (int i = 0; i < k; i++) {
  totalPoints = totalPoints + cardPoints[n - k + i];
}

int maxPoints = totalPoints; 


for (int i = 0; i < k; i++) {
  
  totalPoints = totalPoints +  cardPoints[i];

  
  totalPoints = totalPoints -  cardPoints[n - k + i];

  maxPoints = Math.max(maxPoints, totalPoints);
}
return maxPoints;
 }
 


  public static void main(String[] args) {
    int cardPoints[] = {1,2,3,4,5,6,1};
    int k = 3;

    System.out.println(KCardsSum(cardPoints, k));
  }
}



/* 
Iteration Details
Iteration 1 (i = 0):


totalPoints += cardPoints[0];  // Add the first element from the beginning
totalPoints -= cardPoints[n - k + 0];  // Subtract the last element from the end
totalPoints += cardPoints[0]:
totalPoints = 12 + 1 = 13
totalPoints -= cardPoints[7 - 3 + 0]:
Calculate the index: n - k + 0 = 7 - 3 + 0 = 4
totalPoints = 13 - cardPoints[4] = 13 - 5 = 8
Update maxPoints:
maxPoints = Math.max(12, 8) = 12
Iteration 2 (i = 1):


totalPoints += cardPoints[1];  // Add the second element from the beginning
totalPoints -= cardPoints[n - k + 1];  // Subtract the second last element from the end
totalPoints += cardPoints[1]:
totalPoints = 8 + 2 = 10
totalPoints -= cardPoints[7 - 3 + 1]:
Calculate the index: n - k + 1 = 7 - 3 + 1 = 5
totalPoints = 10 - cardPoints[5] = 10 - 6 = 4
Update maxPoints:
maxPoints = Math.max(12, 4) = 12
Iteration 3 (i = 2):


totalPoints += cardPoints[2];  // Add the third element from the beginning
totalPoints -= cardPoints[n - k + 2];  // Subtract the third last element from the end
totalPoints += cardPoints[2]:
totalPoints = 4 + 3 = 7
totalPoints -= cardPoints[7 - 3 + 2]:
Calculate the index: n - k + 2 = 7 - 3 + 2 = 6
totalPoints = 7 - cardPoints[6] = 7 - 1 = 6
Update maxPoints:
maxPoints = Math.max(12, 6) = 12
Final Result
The maximum score after considering all possible combinations of picking k cards from either end is maxPoints = 12.


*/