package p2591;

/*
 * Return the maximum number of children who may receive exactly 8 dollars:
 *  - All money must be distributed.
 *  - Everyone must receive at least 1 dollar.
 *  - Nobody receives 4 dollars.
 */

class Solution {
    public int distMoney(int money, int children) {
        // Best case scenario each child receives 8 dollars
        if (children * 8 == money) {
            return children;
        }

        // Make sure each child receives at least 1 dollar
        if (money < children) {
            return -1;
        }

        // Calculate the remaining money and children after distributing 8 dollars to
        int childrenReceivingEight = 0;
        while (money != 0) {
            money -= 8; // 1
            children--; // 0
            childrenReceivingEight++; // 2
            // TODO: this is super ugly
            if ((money == 4 && children == 1) || money < 0 || money < children || children == 0) {
                childrenReceivingEight--;
                break;
            }
        }

        return childrenReceivingEight;
    }
}


// ChatGPT solution
// class Solution {
//     public int distMoney(int money, int children) {
//         // If not enough money to give each child at least 1 dollar
//         if (money < children) {
//             return -1;
//         }

//         // Distribute 1 dollar to each child initially
//         money -= children;

//         // Calculate how many children can receive 8 dollars
//         int childrenReceivingEight = Math.min(money / 7, children);

//         // Update remaining money and children
//         money -= childrenReceivingEight * 7;
//         children -= childrenReceivingEight;

//         // Check edge cases:
//         // 1. If 1 child left with exactly 4 dollars, adjust to prevent invalid distribution
//         if (children == 1 && money == 4) {
//             childrenReceivingEight--;
//         }

//         return childrenReceivingEight;
//     }
// }

