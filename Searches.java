/**
 * demo different search algorithms
 * 1) binary
 * 
 */
public class Searches {
    // all search algorithms will return the index if found, else -1

    // Todo: write a recursive method to perform a binary search in an int array
    public static int binarySearchRecursive(int[] a, int target, int start, int end) {

        return -1;
    }

    public static void main(String[] args) {
        int[] ta = {1, 1, 3, 4, 8, 9, 9, 12, 44, 51};
        int[] targets = {2, 9, 44, 999};
        for (int target: targets) {
            System.out.println("target: " + target + " ");
            System.out.println(binarySearchRecursive(ta, target, 0, ta.length-1));
        }
    }
}

