import java.util.*;

public class KKnights {
    static int maxKnights = 0;
    static ArrayList<String> maxConfiguration = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] arr = new char[n][n];
        
        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = '.';
            }
        }

        placeKnights(arr, 0, 0, 0, n);
        
        // Print the maximum number of knights placed
        System.out.println("Maximum number of knights placed: " + maxKnights);
        for (String row : maxConfiguration) {
            System.out.println(row);
        }
    }

    public static void placeKnights(char[][] arr, int row, int col, int placedKnights, int totalKnights) {
        int n = arr.length;

        if (placedKnights > maxKnights) {
            maxKnights = placedKnights;
            maxConfiguration.clear();
            for (int i = 0; i < n; i++) {
                StringBuilder str = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    str.append(arr[i][j]);
                }
                maxConfiguration.add(str.toString());
            }
        }

        if (row >= n) return; // Base case: end of board.

        if (col >= n) {
            placeKnights(arr, row + 1, 0, placedKnights, totalKnights); // Move to the next row.
            return;
        }

        // Check if it's safe to place a knight at (row, col)
        if (isSafe(arr, row, col)) {
            arr[row][col] = 'K';
            placeKnights(arr, row, col + 1, placedKnights + 1, totalKnights); // Place knight and move to the next cell.
            arr[row][col] = '.'; // Backtrack.
        }

        // Move to the next cell without placing a knight
        placeKnights(arr, row, col + 1, placedKnights, totalKnights);
    }

    public static boolean isSafe(char[][] arr, int row, int col) {
        int n = arr.length;
        // Check all possible L-shaped moves of a knight

        // Up and right
        if (row - 2 >= 0 && col + 1 < n && arr[row - 2][col + 1] == 'K') return false;
        // Up and left
        if (row - 2 >= 0 && col - 1 >= 0 && arr[row - 2][col - 1] == 'K') return false;
        // Right and up
        if (row - 1 >= 0 && col + 2 < n && arr[row - 1][col + 2] == 'K') return false;
        // Right and down
        if (row + 1 < n && col + 2 < n && arr[row + 1][col + 2] == 'K') return false;
        // Left and up
        if (row - 1 >= 0 && col - 2 >= 0 && arr[row - 1][col - 2] == 'K') return false;
        // Left and down
        if (row + 1 < n && col - 2 >= 0 && arr[row + 1][col - 2] == 'K') return false;
        // Down and right
        if (row + 2 < n && col + 1 < n && arr[row + 2][col + 1] == 'K') return false;
        // Down and left
        if (row + 2 < n && col - 1 >= 0 && arr[row + 2][col - 1] == 'K') return false;

        return true;
    }
}

