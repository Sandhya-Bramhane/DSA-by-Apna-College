public class FirstNonRepeatingElement {

    public static int findFirstNonRepeating(int[] arr) {
        // Determine the range of the input array
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        // Create arrays to store counts for positive and negative numbers
        int[] posCount = new int[max + 1];
        int[] negCount = new int[Math.abs(min) + 1];

        // Count occurrences of each element
        for (int num : arr) {
            if (num >= 0) {
                posCount[num]++;
            } else {
                negCount[Math.abs(num)]++;
            }
        }

        // Find the first non-repeating element
        for (int num : arr) {
            if (num >= 0) {
                if (posCount[num] == 1) {
                    return num;
                }
            } else {
                if (negCount[Math.abs(num)] == 1) {
                    return num;
                }
            }
        }

        // If no non-repeating element is found, return -1 or any other sentinel value
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, -1, 3, 2};
        int result = findFirstNonRepeating(arr);
        if (result != -1) {
            System.out.println("The first non-repeating element is: " + result);
        } else {
            System.out.println("No non-repeating element found.");
        }
    }
}
