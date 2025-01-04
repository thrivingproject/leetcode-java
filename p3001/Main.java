package p3001;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Input: a = 1, b = 1, c = 8, d = 8, e = 2, f = 3, Output: 2
        System.out.println("Test 1: " + (solution.minMovesToCaptureTheQueen(1, 1, 8, 8, 2, 3) == 2));

        // Input: a = 5, b = 3, c = 3, d = 4, e = 5, f = 2 Output: 1
        System.out.println("Test 2: " + (solution.minMovesToCaptureTheQueen(5, 3, 3, 4, 5, 2) == 1));

        // Input: a = 4, b = 3, c = 3, d = 4, e = 5, f = 2 Output: 2
        System.out.println("Test 3: " + (solution.minMovesToCaptureTheQueen(4, 3, 3, 4, 5, 2) == 2));

        // Input: a = 1, b = 1, c = 1, d = 4, e = 1, f = 8 Output: 2
        System.out.println("Test 4: " + (solution.minMovesToCaptureTheQueen(1, 1, 1, 4, 1, 8) == 2));

        // Input: a = 1, b = 8, c = 4, d = 3, e = 2, f = 7 Output: 2
        System.out.println("Test 5: " + (solution.minMovesToCaptureTheQueen(1, 8, 4, 3, 2, 7) == 2));

        // Input: a = 8, b = 4, c = 8, d = 8, e = 7, f = 7 Output: 1
        System.out.println("Test 6: " + (solution.minMovesToCaptureTheQueen(8, 4, 8, 8, 7, 7) == 1));

        // Input: a = 3, b = 5, c = 3, d = 2, e = 1, f = 4 Output: 1
        System.out.println("Test 7: " + (solution.minMovesToCaptureTheQueen(3, 5, 3, 2, 1, 4) == 1));

        // Input: a = 5, b = 8, c = 8, d = 8, e = 1, f = 8 Output: 1
        System.out.println("Test 8: " + (solution.minMovesToCaptureTheQueen(5, 8, 8, 8, 1, 8) == 1));
    }
}
