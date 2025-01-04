package p3001;

/**
 * Calculate the minimum number of moves required to capture the queen. (The
 * queen doesn't move)
 * 
 * @param a rook row number
 * @param b rook column number
 * @param c bishop row number
 * @param d bishop column number
 * @param e queen row number
 * @param f queen column number
 */
class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        // Check if rook is on same row or column as queen
        if (a == e) {
            if (a == c) {
                return canRookCapture(b, f, d);
            }
            return 1;
        } else if (b == f) {
            if (b == d) {
                return canRookCapture(a, e, c);
            }
            return 1;
        }

        // Check if bishop is on same diagonal as queen using absolute difference
        if (Math.abs(c - e) == Math.abs(d - f)) {
            // Check if rook is on same diagonal as queen
            if (Math.abs(a - e) == Math.abs(b - f))
                // Check if rook between bishop and queen
                if (a < Math.max(c, e) && a > Math.min(c, e) && b < Math.max(d, f) && b > Math.min(d, f)) {
                    return 2;
                }
            return 1;
        } else {
            return 2;
        }
    }

    /**
     * Check if other piece is in between queen and attacking piece
     * 
     * @param attackingPiece row number
     * @param queen          row number
     * @param otherPiece     row number
     * @return 2 if other piece is in between queen and attacking piece, 1 otherwise
     */
    private int canRookCapture(int attackingPiece, int queen, int otherPiece) {
        if (otherPiece > Math.min(attackingPiece, queen) && otherPiece < Math.max(attackingPiece, queen)) {
            return 2;
        }
        return 1;
    }
}
