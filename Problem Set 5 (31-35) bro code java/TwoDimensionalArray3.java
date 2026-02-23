public class TwoDimensionalArray3 {
    public static void main(String[] args) {
        // tic tac toe 2d array

        char[][] array = { { '-', '-', '-' },
                { '-', '-', '-' },
                { '-', '-', '-' } };

        array[0][0] = 'X';
        array[1][1] = 'O';
        array[2][2] = 'X';

        for (char[] characterone : array) {
            for (char charactertwo : characterone) {
                System.out.print(charactertwo + " ");
            }
            System.out.println();
        }
    }
}