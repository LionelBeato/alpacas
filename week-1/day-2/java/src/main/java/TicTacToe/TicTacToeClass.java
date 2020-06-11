package TicTacToe;

public class TicTacToeClass {

    // instance variables for our game
    private char[][] board;
    private int turns;

    // constructor for the game
    public TicTacToeClass(){
        board = new char[3][3];
        turns = 0;

        // this is a nested for loop
        // this loop populates each tile with an empty space
        for (int r=0; r<3; r++)
            for (int c=0;c<3;c++)
                board[r][c] = ' ';
    }

    // accessor methods
    // these methods determine game states
    public boolean isWinner(char p){
        int r = 0;
//         here we would write out the win state for our game
//         if three tiles in a row are filled then return true
        if (board[r][0] == p && board[r][1] == p && board[r][2] == p){
            return true;
        }

        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) {
            return true;
        }

        if (board[0][2] == p && board[1][1] == p && board[2][0] == p){
            return true;
        }

        return false;
    }

    public boolean isFull(){
        // here we would check for board occupancy
        // if all tiles are filled return true



        for (int r=0; r<3; r++){
            for (int c=0;c<3;c++){
                 if (board[r][c] != ' '){
                     if (numTurns() == 9){
                         return true;
                     }
                }
            }
        }

        return false;
    }

    public boolean isCat(){
        // here we would check for a tie
        // if board is full and both players are not winners then return true
        
        return false;
    }

    // this method in particular checks to see if a tile is a valid move
    public boolean isValid( int r, int c){
        if (0 <= r && r <= 2 && 0 <= c && c <= 2)
            return true;
        else
            return false;
    }

    public int numTurns(){
        return turns;
    }

    // method to check where a player played a tile
    public char playerAt( int r, int c){
        if (isValid(r, c))
            return board[r][c];
        else
            return '@';
    }

    // actual display of our board
    // note that the tiles are just indices of our 2 dimensional array
    public void displayBoard()
    {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    // this method assigns a tile to a player
    public void playMove( char p, int r, int c){
        board[r][c] = p;
        turns++;
    }


}
