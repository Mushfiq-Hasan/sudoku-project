import java.util.ArrayList;
import java.util.Random;

public class Sudoku{
    public static void main(String[] args) {
        int[][] board = new int[9][9];
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            nums.add(i);
        }
        System.out.println("EMPTY BOARD:");
        printBoard(board);
        fillBoard(board, nums);
        System.out.println("\nSOLVED BOARD:");
        printBoard(board);
    }

    public static boolean fillBoard(int[][] board, ArrayList<Integer> nums){
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (board[row][col] == 0) {
                    ArrayList<Integer> tempList = new ArrayList<>();
                    for (int i = 0; i < nums.size(); i++) {
                        tempList.add(nums.get(i));
                    }
                    shuffleList(tempList);

                    for (int i = 0; i < tempList.size(); i++) {
                        int num = tempList.get(i);
                        if (isValid(board, row, col, num)) {
                            board[row][col] = num;
                            if (fillBoard(board, nums)) {
                                return true;
                            }
                            board[row][col] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public static void shuffleList(ArrayList<Integer> list) {
        Random rand = new Random();
    
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = rand.nextInt(list.size());
            int temp = list.get(i);
            list.set(i, list.get(randomIndex));
            list.set(randomIndex, temp);
        }
    }

    public static boolean isValid(int[][] board, int row, int col, int num) {

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0) {
                System.out.println("+-------+-------+-------+");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("+-------+-------+-------+");
    }
}