package TicTacToe;

import java.util.Scanner;

public class TicTacToeRunner {
    public static void main(String[] args) {
        // variables
        Scanner keyboard = new Scanner(System.in);
        TicTacToeClass ttt = new TicTacToeClass();
        char p = 'X';
        int r;
        int c;

        // our main gameplay loop
        // this loops checks for a winner or full gameboard fullness at every iteration
        while (! (ttt.isWinner('X') || ttt.isWinner('O') || ttt.isFull())){
            ttt.displayBoard();
            System.out.print("'" + p + "', choose your location (row,column): ");
                r = keyboard.nextInt();
                c= keyboard.nextInt();

                while (!ttt.isValid(r, c) || ttt.playerAt(r,c) != ' '){
                    if (!ttt.isValid(r, c))
                        System.out.println("That is not a valid location. Try again.");
                    else if (!ttt.isValid(r, c))
                        System.out.println("That location is already full. Try again.");

                    System.out.print("Choose your location(row,column: ");
                    r = keyboard.nextInt();
                    c = keyboard.nextInt();
                }
                ttt.playMove(p,r,c);

                // code to switch current player
                if (p == 'X')
                    p = '0';
                else
                    p = 'X';
        }
        ttt.displayBoard();

        // determining the final game state
        if (ttt.isWinner('X'))
            System.out.println("X is the winner");
        if (ttt.isWinner('O'))
            System.out.println("O is the winner");
        if (ttt.isCat())
            System.out.println("The game is a tie.");
    }
}
